package task10_3_1.decorators;

import task10_3_1.Printable;

public class PostSpaceDecorator extends PostDecorator{

    public PostSpaceDecorator(Printable string) {
        super(string);
    }

    @Override
    public void print(){
        super.print();
        System.out.print(" ");
    }

}

