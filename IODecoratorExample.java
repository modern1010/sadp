import java.io.*;

class LowercaseInputStream extends FilterInputStream {
    LowercaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? -1 : Character.toLowerCase(c);
    }
}

public class IODecoratorExample {
    public static void main(String[] args) {
        try (InputStream is = new LowercaseInputStream(new FileInputStream("input.txt"))) {
            int data;
            while ((data = is.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
