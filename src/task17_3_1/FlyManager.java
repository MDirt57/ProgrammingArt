package task17_3_1;

import java.util.ArrayList;

public class FlyManager implements Mediator {

    private Runway runway = new Runway();

    private PlanesInFlight planesInFlight = new PlanesInFlight();

    private PlanesOnGround planesOnGround = new PlanesOnGround();

    void addPlaneInFlight(PlaneComponent plane){
        planesInFlight.addPlane(plane);
    }

    void addPlanesOnGround(PlaneComponent plane){
        planesOnGround.addPlane(plane);
    }


    @Override
    public void broadcast(PlaneComponent plane) {   // запит на приземлення

        ArrayList<PlaneComponent> planes = (ArrayList<PlaneComponent>) planesOnGround.planes.clone();

        for (PlaneComponent planeOnGround: planes){
            planeOnGround.handleTakeOff();
            planesInFlight.addPlane(planeOnGround);
            planesOnGround.removePlane(planeOnGround);
        }

        plane.handleLanding();
        planesOnGround.addPlane(plane);

    }
}
