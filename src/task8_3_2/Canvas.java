package task8_3_2;

import task8_3_2.buttons.*;
import task8_3_2.sizes.LargeSize;
import task8_3_2.sizes.MediumSize;
import task8_3_2.sizes.SmallSize;
import task8_3_2.sizes.UserSize;

public class Canvas {

  public static void main(String[] args) {

    CheckboxButton checkboxButton = new CheckboxButton(new SmallSize());
    checkboxButton.draw();

    RadioButton radioButton = new RadioButton(new MediumSize());
    radioButton.draw();

    DropdownButton dropdownButton = new DropdownButton(new LargeSize());
    dropdownButton.draw();

    Button imageButton = new ImageButton(new UserSize(10));
    imageButton.draw();

  }

}
