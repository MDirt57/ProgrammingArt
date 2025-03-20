package task17_3_1;

import java.util.ArrayList;

/**
 * Літаки, що приземлилися
 */
public class PlanesOnGround {

  ArrayList<PlaneComponent> planes = new ArrayList<>();

  public void addPlane(PlaneComponent plane) {
    planes.add(plane);
  }

  public void removePlane(PlaneComponent plane) {
    planes.remove(plane);
  }

}
