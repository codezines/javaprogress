import java.util.Scanner;

public class ascii {
    public static void main(String args[]) {
        char pr = '@';
        int rr = pr;
        System.out.println("the ASCII value of" + " " + pr + " " + "is" + " " + rr);
        Scanner s = new Scanner(System.in);
        //ASCII value of user given string
        System.out.println("enter the string");
        String alphabets = s.nextLine();
        for (int i = 0; i < alphabets.length(); i++) {
            char cha = alphabets.charAt(i);
            System.out.println("ASCII value of " + cha + " is - " + (int) cha);
        }
        System.out.println("enter the character");
        //ASCII value of user given character
        char ch = s.next().charAt(0);
        int chh = ch;
        System.out.println("ASCII value of" + ch + "is:" + chh);

        //ASCII values of all capital alphabits
        System.out.println("the ASCII values of capital alphabits are");
        for (char cc = 'A'; cc <= 'Z'; cc++) {
            System.out.println("ASCII values of" + cc + "is:" + (int) cc);
        }
        //ASCII values of all small alphabits
        System.out.println("the ASCII values of small alphabits are");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("ASCII values of" + c + "is:" + (int) c);
        }
        //SCII values between capital and small alphabits are
        System.out.println("the ASCII values of inbetween small and capital alphabits are");
        for (char crc = 'Z'; crc <='a'; crc++) {
            System.out.println("ASCII values of" + crc + "is:" + (int) crc);
        }
    }
}