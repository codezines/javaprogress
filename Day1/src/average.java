import java.util.Scanner;

public class average{
    public static void main(String args[]) {
        int i;
        float sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size");
        int n=s.nextInt();
        float num[]=new float[n];
        System.out.println("enter "+n+" numbers");
        for(i=0;i<n;i++) {
            num [i]=s.nextInt();
            sum=sum+num[i];
        }
        float average=sum/n;
        System.out.println("average is:"+ average);

    }
    }