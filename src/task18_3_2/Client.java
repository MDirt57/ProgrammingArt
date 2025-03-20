package task18_3_2;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Caretaker caretaker = new Caretaker(triangle);

        String[] edges = {
                "b",
                "c",
                "a",
                "duplicateA",
                "c",
                "b",
                "halfA"
        };

        float[] values = {
                4,
                5,
                4,
                1, // "duplicateA",
                6,
                3,
                1, // "halfA"
        };

        for (int index = 0; index < edges.length; index++) {
            caretaker.changeSide(edges[index], values[index]);
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("Undo");

        for (int i = 0; i < edges.length; i++){
            caretaker.undo();
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("Restore min square");

        caretaker.restoreMinSquare();
        System.out.println("Volume = " + triangle.square());



    }

}
