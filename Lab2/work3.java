import java.util.Scanner;
public class work3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int []x=new int[10];
        int i=0;
        for1:while(i<9){
        x[i]=input.nextInt();
        if(x[i]!=-999)
        i++;
        else
        break for1;
    }
    int n=readData(x);
    System.out.println("number of elements in array is "+n);
    System.out.println("the array is");
    printList(x,n);
    }
    public static int readData(int [ ] x){
        int i=0;
        for2:while(i<9){
        if(x[i]!=-999)
        i++;
        else
        break for2;
    }
        return i;

    }
    public static void printList(int[ ] x, int n){
        for(int i=0;i<n;i++){
            System.out.print(x[i]+",");
        }
    }
}


