package task17_3_1;

import java.util.ArrayList;

/**
 * Літаки у повітрі
 */
public class PlanesInFlight {

  /**
   * Список літаків
   */
  ArrayList<PlaneComponent> planes = new ArrayList<>();

  /**
   * Додати літак
   * @param plane літак
   */
  public void addPlane(PlaneComponent plane) {
    planes.add(plane);
  }

  /**
   * Видалити літак зі списку
   * @param plane літак
   */
  public void removePlane(PlaneComponent plane) {
    planes.remove(plane);
  }

}
