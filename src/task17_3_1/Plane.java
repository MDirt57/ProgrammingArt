package task17_3_1;

/**
 * Літак
 */
public class Plane implements PlaneComponent {

  /**
   * Чи злетів літак
   */
  private boolean isInTheAir;

  /**
   * Ідентифікатор літака
   */
  private int id;

  private Mediator manager;

  public Plane(int id) {
    this.id = id;
    isInTheAir = false;
  }

  public void setManager(Mediator manager){
    this.manager = manager;
  }

  @Override
  public void handleLanding(){
    if (isInTheAir){
      System.out.println("Plane " + id + " is landing...");
      setIsInTheAir(false);
    }
  }

  /**
   * Повертає ознаку чи літак в повітрі
   * @return стан літака - чи в повітрі
   */
  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  /**
   * Встановити ознаку чи злетів літак
   * @param isInTheAir чи злетів літак
   */
  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  /**
   * Ідентифікатор літака
   * @return ідентифікатор
   */
  public int getId() {
    return id;
  }

  @Override
  public void broadcastLanding() {
    manager.broadcast(this);
  }

  @Override
  public void handleTakeOff() {
    if(!isInTheAir) {
      System.out.println("Plane " + id + " is taking off...");
      setIsInTheAir(true);
    }
  }
}
