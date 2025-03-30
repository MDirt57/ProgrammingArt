package task20_3_3;

public class HighState implements FanState{
    @Override
    public void turnUp(Fan fan) {
        return;
    }

    @Override
    public void turnDown(Fan fan) {
        System.out.println("Fan is on medium");
        fan.setState(new MediumState());
    }
}
