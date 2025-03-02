package task12_3_1;

import java.util.ArrayList;
import java.util.List;

class CarPartsCache {

    private final List<Engine> engines = new ArrayList<>();
    private final List<Wheel> wheels = new ArrayList<>();

    public Engine getEngine(Engine.Fuel fuel, int power){
        for (Engine engine: engines){
            if (engine.fuel == fuel && engine.power == power){
                return engine;
            }
        }
        Engine engine = new Engine(power, fuel);
        engines.add(engine);
        return engine;
    }

    public Wheel getWheel(int diameter){
        for (Wheel wheel: wheels){
            if (wheel.diameter == diameter){
                return wheel;
            }
        }
        Wheel wheel = new Wheel(diameter);
        wheels.add(wheel);
        return wheel;
    }

}
