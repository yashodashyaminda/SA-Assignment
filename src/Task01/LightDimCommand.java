package Task01;

public class LightDimCommand implements Command{
    private Light light;
    private int previousLevel;
    private int newLevel;

    public LightDimCommand(Light light, int newLevel) {
        this.light = light;
        this.newLevel = newLevel;
    }

    public void execute() {
        previousLevel = light.getBrightness();
        light.dim(newLevel);
    }

    public void undo() {
        light.dim(previousLevel);
    }

}
