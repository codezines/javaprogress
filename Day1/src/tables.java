import java.util.Scanner;

public class tables {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the table you want to print:");
        int n=s.nextInt();
        int j;
        System.out.println("the"+ n+"table is:");
        for(int i=1;i<=10;i++){
            j=n*i;
            System.out.println(n+"*"+i+"="+j);
        }

    }
}
