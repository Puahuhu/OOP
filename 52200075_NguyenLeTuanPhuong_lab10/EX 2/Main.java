public class Main {
    public static void main(String[] args) {
        ImageLoader imageLoader = ImageLoader.getInstance();
        String result = imageLoader.loadImage();
        System.out.println(result);
    }
}
