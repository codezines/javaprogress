import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        //even and odd places in a name
        Scanner s=new Scanner(System.in);
        System.out.println("enter your name");
        String name= s.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if(i%2==0){
                System.out.println("the characters at even places in the given name is "+" " +name.charAt(i)+" ");
            }
            else{
                System.out.println("the charaters at odd places are "+ " "+ name.charAt(i)+" ");
            }
        }

        }

    }
