package task15_3_3;

public class TVSimulator {
    public static void main(String[] args) {

        Device tv = new Television();
        Device radio = new Radio();

        RemoteController controller = new RemoteController(tv);
        RemoteController radioController = new RemoteController(radio);
        RemoteController allController = new RemoteController(tv, radio);

        controller.deviceOn();

        for (int i = 0; i < 30; i++) {
            controller.deviceNextChanel();
        }
        controller.deviceVolumeUp();

        controller.deviceVolumeUp();
        controller.deviceVolumeUp();

        controller.devicePrevChanel();

        controller.deviceVolumeDown();

//        controller.deviceOff();

        radioController.deviceOn();
        radioController.deviceVolumeUp();
        radioController.deviceVolumeUp();

        allController.deviceOff();

    }
}
