import java.util.*;
class hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- !=0){
            sc.nextLine();
            System.out.print("Enter the name: ");
            String name = sc.nextLine();
            System.out.print("Enter your roll: ");
            int roll = sc.nextInt();
            System.out.print("Enter the marks in subject 1: ");
            int m1 = sc.nextInt();
            System.out.print("Enter the marks in subject 2: ");
            int m2 = sc.nextInt();
            System.out.print("Enter the marks in subject 3: ");
            int m3 = sc.nextInt();
            int sum = m1+m2+m3;
            System.out.println("The name is: "+name);
            System.out.println("The roll number is: "+roll);
            System.out.println("Marks in subject 1 is: "+m1);
            System.out.println("Marks in subject 2: "+m1);
            System.out.println("Marks in subject 3: "+m1);
            System.out.println("The total marks is: "+sum);
        } 
        sc.close();    


    }
}
