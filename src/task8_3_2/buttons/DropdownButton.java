package task8_3_2.buttons;

import task8_3_2.sizes.Size;

public class DropdownButton extends Button {

  public DropdownButton(Size buttonSize) {
    super(buttonSize);
  }

  public void draw() {
    super.draw();
    System.out.println("Drawing a dropdown button.\n");
  }
}
