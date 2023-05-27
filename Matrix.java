import java.util.*;
class Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the columns: ");
        int col = sc.nextInt();
        int [][] x = new int[row][col];
        int [][] y = new int[row][col];
        System.out.println("Enter the first matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                x[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                y[i][j] = sc.nextInt();
            }
        }
        int [][]z = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        int [][]p = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                p[i][j] = x[i][j] - y[i][j];
            }
        }
        int [][]m = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m[i][j] =0;
                m[i][j] += x[i][j]*y[i][j];
            }
        }
        System.out.println("The addition of the matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The substraction of the matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The product of the matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        sc.close(); 
    }
}
