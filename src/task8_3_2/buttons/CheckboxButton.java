package task8_3_2.buttons;

import task8_3_2.sizes.Size;

public class CheckboxButton extends Button {

  public CheckboxButton(Size buttonSize) {
    super(buttonSize);
  }

  public void draw() {
    super.draw();
    System.out.println("Drawing a checkbox button.\n");
  }

}
