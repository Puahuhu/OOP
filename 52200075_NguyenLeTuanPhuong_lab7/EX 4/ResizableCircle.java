public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {
        this.radius = 5.0;
    }

    public void resize(int percent) {
        this.radius *= percent / 100.0;
    }
}