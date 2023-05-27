import java.util.*;

interface Arithmetic{
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
    public void mod(int a,int b);
    public void add(float a,float b);
    public void sub(float a,float b);
    public void mul(float a,float b);
    public void div(float a,float b);
    public void mod(float a,float b);
}

class Calculator implements Arithmetic{
    public void add(int a,int b){
        int result = a+b;
        System.out.println(result);
    }
    public void sub(int a,int b){
        int result = a-b;
        System.out.println(result);
    }
    public void mul(int a,int b){
        int result = a*b;
        System.out.println(result);
    }
    public void div(int a,int b){
        int result = a/b;
        System.out.println(result);
    }
    public void mod(int a,int b){
        int result = a%b;
        System.out.println(result);
    }
    public void add(float a,float b){
        float result = a+b;
        System.out.println(result);
    }
    public void sub(float a,float b){
        float result = a-b;
        System.out.println(result);
    }
    public void mul(float a,float b){
        float result = a*b;
        System.out.println(result);
    }
    public void div(float a,float b){
        float result = a/b;
        System.out.println(result);
    }
    public void mod(float a,float b){
        float result = a%b;
        System.out.println(result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("The operations to perform are +,-,*,/,%.");
        System.out.println("Enter your choice:");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':
            obj.add(a,b);
            break;
            case '-':
            obj.sub(a,b);
            break;
            case '*':
            obj.mul(a,b);
            break;
            case '/':
            obj.div(a,b);
            case '%':
            obj.mod(a,b);
            break;
        }
        sc.close();

    }


}
