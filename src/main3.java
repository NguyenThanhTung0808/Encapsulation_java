public class main3  {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setLength(6.9);
        rectangle.setWidth(12.8);

        double length = rectangle.getLength();
        double width = rectangle.getWidth();

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
