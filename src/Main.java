import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the length of the first side of the rectangle: ");

        if(in.hasNextDouble())
        {
            double side1 = in.nextDouble();

            System.out.println("Enter the length of the second side of the rectangle: ");

            if(in.hasNextDouble()) {
                double side2 = in.nextDouble();
                double area = side1 * side2;
                double perimeter = 2 * (side1 + side2);
                double diagonal = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

                System.out.println("Area of the rectangle: " + area);
                System.out.println("Perimeter of the rectangle: " + perimeter);
                System.out.println("Length of the diagnoal: " + diagonal);
            } else if (in.hasNextDouble()) {
                System.out.println("Valid input for the second side length.");
            }
            else {
                System.out.println("Invalid input for the first side length.");
            }
            in.close();

        }
    }
}