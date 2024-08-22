package Task01;

public abstract class LightDimCommand implements Command{
    private Light light;
    private int previousLevel;
    private int newLevel;

    abstract void getBrightness();

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
