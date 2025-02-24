package task8_3_2.buttons;

import task8_3_2.sizes.Size;

public class ImageButton extends Button{
    public ImageButton(Size buttonSize) {
        super(buttonSize);
    }

    @Override public void draw(){
        super.draw();
        System.out.println("Drawing an image button.\n");
    }


}
