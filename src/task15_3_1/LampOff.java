package task15_3_1;

import java.util.Arrays;
import java.util.List;

public class LampOff implements Command{

    final private List<Lamp> lamps;

    public LampOff(Lamp... lamps){
        this.lamps = Arrays.asList(lamps);
    }

    @Override
    public void execute() {
        for (Lamp lamp: lamps){
            lamp.lightOff();
        }
    }
}
