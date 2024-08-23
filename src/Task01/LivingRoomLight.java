package Task01;

public class LivingRoomLight implements Light{
    private int brightness ;

    public void on(){
        brightness = 100;
        System.out.println("Living room light is ON at full brightness.");
    }

    public void off(){
        brightness = 0;
        System.out.println("Living room light is OFF.");
    }

    public void dim(int level){
        brightness = level;
        System.out.println("Living Room light dimmed to "+brightness+"%.");
    }

    public int getBrightness() {
        return brightness;
    }
}
