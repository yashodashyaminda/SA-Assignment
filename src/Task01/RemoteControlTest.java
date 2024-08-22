package Task01;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        KitchenRoomLight kitchenLight = new KitchenRoomLight();
        LivingRoomLight livingRoomLight = new LivingRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenLight, 50) {
            @Override
            void getBrightness() {

            }
        };

        LightOnCommand livingRoomLightOn = new LightOnCommand((Light) livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand((Light) livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand((Light) livingRoomLight, 70) {
            @Override
            void getBrightness() {

            }
        };

        remote.setCommand(0, kitchenLightOn, kitchenLightOff);
        remote.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        remote.onButtonWasPushed(0);
        remote.dimButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(1);
        remote.dimButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();
    }
}

