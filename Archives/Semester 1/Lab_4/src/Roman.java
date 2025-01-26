import java.util.Scanner;
public class Roman {
    public static void main(String[] args) {
        int number = 0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number to put in Roman Numeral: ");
        number = scn.nextInt();

        if(number == 1) {
            System.out.println("I");
        }
        else if(number == 2) {
            System.out.println("II");
        }
        else if(number == 3) {
            System.out.println("III");
        }
        else if(number == 4) {
            System.out.println("IV");
        }
        else if(number == 5) {
            System.out.println("V");
        }
        else if(number == 6) {
            System.out.println("VI");
        }
        else if(number == 7) {
            System.out.println("VII");
        }
        else if(number == 8) {
            System.out.println("VIII");
        }
        else if(number == 9) {
            System.out.println("IX");
        }
        else if(number == 10) {
            System.out.println("X");
        }
    }
}

