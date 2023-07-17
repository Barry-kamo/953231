import java.util.Scanner;

public class work4 {
    public static double sumcolumn(double[][]m,int columindex){
    double x=0.0;
    for(int i=0;i<3;i++){
        x+=m[i][columindex];
    }
    return x;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[][]m=new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row :");
        for(int i=0;i<3;i++)
        for(int j=0;j<4;j++){
            m[i][j]=scan.nextDouble(); 
        }
        for(int i=0;i<4;i++){
            System.out.println("Sum of the elements at column"+i+"is"+sumcolumn(m,i));
        }

    }
}
