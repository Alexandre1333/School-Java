public class LargerThanN {

    public static void displayNumbersGreaterThanN(int[] arr, int n) {
            System.out.println("Numbers greater than " + n + ":");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > n) {
                    System.out.println(arr[i]);
                }
            }
        }

        public static void main(String[] args) {

            int[] array = {3, 7, 1, 9, 2, 8, 6};


            System.out.println("Example 1:");
            displayNumbersGreaterThanN(array, 5);

            System.out.println("\nExample 2:");
            displayNumbersGreaterThanN(array, 2);
        }
    }


