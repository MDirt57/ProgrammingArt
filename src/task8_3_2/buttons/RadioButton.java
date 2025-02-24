package task8_3_2.buttons;

import task8_3_2.sizes.Size;

public class RadioButton extends Button {

  public RadioButton(Size buttonSize) {
    super(buttonSize);
  }

  public void draw() {
    super.draw();
    System.out.println("Drawing a radio button.\n");
  }

}
