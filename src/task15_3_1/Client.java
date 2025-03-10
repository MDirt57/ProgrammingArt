package task15_3_1;

public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller(new LampOn(kitchenLamp), new LampOff(kitchenLamp));
        Controller controllerHallLamp = new Controller(new LampOn(hallLamp), new LampOff(hallLamp));
        Controller controllerBedroomLamp = new Controller(new LampOn(bedroomLamp), new LampOff(bedroomLamp));
        Controller controllerBathroomLamp = new Controller(new LampOn(bathroomLamp), new LampOff(bathroomLamp));
        Controller controllerUniversal = new Controller(
                new LampOn(kitchenLamp, hallLamp, bedroomLamp, bathroomLamp),
                new LampOff(kitchenLamp, hallLamp, bedroomLamp, bathroomLamp)
        );

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();

        controllerUniversal.off();

    }
}
