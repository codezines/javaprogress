import java.util.Scanner;

public class swapping {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int temp;
        System.out.println("befor swapping the number 1 is:"+n1);
        System.out.println("befor swapping the number 2 is:"+n2);
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("after swapping the number 1 is:"+n1);
        System.out.println("after swapping the number 2 is:"+n2);
    }
}
