package task20_3_3;

public class LowState implements FanState{
    @Override
    public void turnUp(Fan fan) {
        System.out.println("Fan is on medium");
        fan.setState(new MediumState());
    }

    @Override
    public void turnDown(Fan fan) {
        return;
    }
}
