package Task01;

public class LivingRoomLight implements Light{
    private int brightness = 0;
    int level ;

    @Override
    public void dim(int level) {

    }

    public void on(){
        brightness = 100;
        System.out.println("Living room light is ON at full brightness.");
    }

    public void off(){
        brightness = 0;
        System.out.println("Living room light is OFF.");
    }

    public void dim() {
        brightness = level;
        System.out.println("Living room light dimmed to" + level + "% brightness.");
    }

    public int getBrightness() {
        return brightness;
    }
}
