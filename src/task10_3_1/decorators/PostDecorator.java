package task10_3_1.decorators;

import task10_3_1.Printable;

public class PostDecorator implements Printable {

    final private Printable wrappedString;

    public PostDecorator(Printable string) {
        wrappedString = string;
    }

    public void print() {
        wrappedString.print();
    }

}
