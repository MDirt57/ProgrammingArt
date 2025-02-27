package task10_3_1.decorators;

import task10_3_1.Printable;

public class PostEndlDecorator extends PostDecorator{

    public PostEndlDecorator(Printable string) {
        super(string);
    }

    @Override
    public void print(){
        super.print();
        System.out.print("\n");
    }

}

