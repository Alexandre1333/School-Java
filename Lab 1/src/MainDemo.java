import java.util.Scanner;
public class MainDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Main m = new Main(0,"",0);
        m.setAge(scn.nextInt());
        m.setName(scn.next());
        m.setWeight(scn.nextDouble());
        System.out.println(m.getAge() + m.getName() + m.getWeight());
    }
}
