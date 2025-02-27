package task10_3_1.decorators;

import task10_3_1.Printable;

public class PostComaDecorator extends PostDecorator{

    public PostComaDecorator(Printable string) {
        super(string);
    }

    @Override
    public void print(){
        super.print();
        System.out.print(",");
    }

}
