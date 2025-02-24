package task8_3_2.sizes;

public class UserSize implements Size {

    public UserSize(Integer size){this.size = size;}

    private Integer size;

    @Override
    public void setSize() {
        System.out.println("Setting size to " + size + "...");
    }
}
