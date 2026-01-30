// VariablesTest application
public class VariablesTest {
    public static void main(String[] args) {
        
        double d1 = 0.29/0.0001;
        double d2 = 0.00029*1.0e7;
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d1 equals d2: " + (d1 == d2) );
        double epsilon = 1e-10;
        if (Math.abs(d1 - d2) < epsilon) {
            System.out.print("d1,d2 differ by less than ");
            System.out.println( epsilon );
        }
    }
}