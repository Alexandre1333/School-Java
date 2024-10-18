public class InfiniteLoop {
    public static void main(String[] args) {

        int n = 0;
        do{
            System.out.println("Hello");
            n += 1;
        }while(n < 5);
        System.out.println("n value is: " + n);

        }
    }
