package task18_3_2;

import kotlin.Pair;
import java.util.Stack;

public class Caretaker {

    final private Triangle triangle;
    final private Stack<Triangle.Memento> history = new Stack<>();
    private Pair<Triangle.Memento, Float> minSquare;

    public Caretaker(Triangle triangle){
        this.triangle = triangle;
    }

    public void changeSide(String action, float value){
        Triangle.Memento memento = triangle.save();
        history.push(memento);
        if (minSquare == null || triangle.square() < minSquare.getSecond()){
            minSquare = new Pair<>(memento, triangle.square());
        }
        switch (action) {
            case "a":
                triangle.setA(value);
                break;
            case "b":
                triangle.setB(value);
                break;
            case "c":
                triangle.setC(value);
                break;
            case "duplicateA":
                triangle.duplicateA();
                break;
            case "duplicateB":
                triangle.duplicateB();
                break;
            case "duplicateC":
                triangle.duplicateC();
                break;
            case "halfA":
                triangle.halfA();
                break;
            case "halfB":
                triangle.halfB();
                break;
            case "halfC":
                triangle.halfC();
                break;
        }
    }

    public void undo(){
        if (history.empty()){
            return;
        }
        triangle.restore(history.pop());
    }

    public void restoreMinSquare(){
        triangle.restore(minSquare.getFirst());
    }


}
