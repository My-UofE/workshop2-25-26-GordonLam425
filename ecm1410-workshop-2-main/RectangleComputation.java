public class RectangleComputation {
    public static void main(String[] args) {
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        double perimeter = (width + height) * 2;
        double area = width * height;

        boolean isSquare;
        double epsilon = 1e-10;
        if (Math.abs(width - height) < epsilon) {
            isSquare = true;
        } else {
            isSquare = false;
        }   
        
        if (isSquare) {
            System.out.println("sahpe: square");
        } else {
            System.out.println("shape: rectangle");
        }
        
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);

    }
}