import java.util.Scanner;
public class BankChargesDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BankCharges bc = new BankCharges(0,0);

        System.out.println("What is the account balance? ");
        bc.setBalance(scn.nextDouble());

        System.out.println("How many checks were written? ");
        bc.setChecksWritten(scn.nextInt());

        System.out.println("Bank fees: $" + bc.getFees());

    }
}
