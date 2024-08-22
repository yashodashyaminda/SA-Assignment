package Task01;

public class KitchenRoomLight implements Light{
    private int brightness = 0;
    int level ;


    public void on(){
        brightness = 100;
        System.out.println("Kichen light is ON at full brightness.");
    }

    public void off(){
        brightness = 0;
        System.out.println("Kichen light is OFF.");
    }

    public void dim() {
        brightness = level;
        System.out.println("Kichen light dimmed to" + level + "% brightness.");
    }

    public int getBrightness() {
        return brightness;
    }

}
