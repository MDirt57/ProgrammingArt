package task13_3_1;

public class ImageProxy implements DisplayObject{

    final private String path;
    private ImageFile image;

    public ImageProxy(String path){
        this.path = path;
    }

    @Override
    public void display() {
        image = new ImageFile(path);
        image.display();
    }
}
