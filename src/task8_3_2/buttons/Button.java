package task8_3_2.buttons;

import task8_3_2.sizes.Size;

public class Button {

    public Button(Size buttonSize){this.buttonSize = buttonSize;}

    private Size buttonSize;

    public void draw(){
        buttonSize.setSize();
    }

}
