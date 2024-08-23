package Task01;

public class KitchenRoomLight implements Light{
    private int brightness ;


    public void on(){
        brightness = 100;
        System.out.println("Kitchen light is ON at full brightness.");
    }

    public void off(){
        brightness = 0;
        System.out.println("Kitchen light is OFF.");
    }

    public void dim(int level) {
        brightness = level;
        System.out.println("Kitchen light dimmed to "+ level +" %.");
    }

    public int getBrightness() {
        return brightness;
    }

}
