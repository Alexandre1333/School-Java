import java.util.Scanner;

public class PetDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);



        System.out.println("Enter type of pet: ");
        String type = scn.nextLine();

        System.out.println("Enter name of pet: ");
        String name = scn.nextLine();

        System.out.println("Enter age of pet: ");
        int age = scn.nextInt();

        Pet p = new Pet(name, age, type );
        p.setType("cat");
        System.out.println("Type of pet: " + p.getType() + "\nName: " + p.getName() + "\nAge: "+ p.getAge());
    }
}
