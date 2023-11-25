interface Command { void execute(); }

class Light { void on() { System.out.println("Light is ON"); } void off() { System.out.println("Light is OFF"); } }
class CeilingFan { void on() { System.out.println("Ceiling Fan is ON"); } void off() { System.out.println("Ceiling Fan is OFF"); } }

class LightCommand implements Command { private Light light; LightCommand(Light light) { this.light = light; } public void execute() { light.on(); } }
class CeilingFanCommand implements Command { private CeilingFan fan; CeilingFanCommand(CeilingFan fan) { this.fan = fan; } public void execute() { fan.on(); } }

class RemoteControl { private Command command; void setCommand(Command command) { this.command = command; } void pressButton() { command.execute(); } }

public class CommandPatternExample {
    public static void main(String[] args) {
        Light light = new Light();
        CeilingFan fan = new CeilingFan();
        Command lightOn = new LightCommand(light);
        Command fanOn = new CeilingFanCommand(fan);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.setCommand(fanOn);
        remote.pressButton();
    }
}
