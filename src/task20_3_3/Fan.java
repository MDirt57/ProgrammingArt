package task20_3_3;

public class Fan {

  private FanState state = new LowState();

  public void setState(FanState state) {
    this.state = state;
  }

  public FanState getState() {
    return state;
  }

  public void turnUp() {
    state.turnUp(this);
  }

  public void turnDown() {
    state.turnDown(this);
  }

}
