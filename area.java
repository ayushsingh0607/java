import java.util.*;
public class area{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.Area of circle");
        System.out.println("2.Area of square");
        System.out.println("3.Area of rectangle");
        System.out.println("4.Area of triangle");
        System.out.println("Please choose the option to be calculated: ");
        int num = sc.nextInt();
        switch(num){
            case 1 : System.out.println("Please enter the radius : ");
            double radius = sc.nextDouble();
            double areac = (22*radius*radius)/7;
            System.out.println("The area of the circle is: "+areac);
            break;

            case 2 : System.out.println("Please enter the side: ");
            double side = sc.nextDouble();
            double areas = side*side;
            System.out.println("The area of a square is: "+areas);
            break;

            case 3 : System.out.println("Please enter the length: ");
            System.out.println("Please enter the breadth: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double arear = l*b;
            System.out.println("The area of a rectangle is: "+arear);
            break;

            case 4 : System.out.println("Please enter the length: ");
            System.out.println("Please enter the breadth: ");
            System.out.println("Please enter the height: ");
            double len = sc.nextDouble();
            double brea = sc.nextDouble();
            double hei = sc.nextDouble();
            double areat = (len*brea*hei)/2;
            System.out.println("The area of a traingle is: "+areat);
            break;
        }
        sc.close();
    }
}
