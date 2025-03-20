package task17_3_1;

public class Main {

  public static void main(String[] args) {

    FlyManager manager = new FlyManager();

    Plane plane1 = new Plane(123);
    Plane plane2 = new Plane(124);
    Plane plane3 = new Plane(125);

    plane1.setIsInTheAir(true);
    manager.addPlaneInFlight(plane1);
    manager.addPlanesOnGround(plane2);
    manager.addPlanesOnGround(plane3);

    plane1.setManager(manager);
    plane2.setManager(manager);
    plane3.setManager(manager);

    plane1.broadcastLanding();
    plane2.broadcastLanding();

  }

}
