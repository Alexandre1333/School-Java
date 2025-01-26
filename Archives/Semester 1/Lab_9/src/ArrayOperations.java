public class ArrayOperations {


    public static int getTotalElements(int[] arr) {
        return arr.length;
    }


    public static double getAverage(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return (double) total / arr.length;
    }


    public static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static int getMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static double getMiddleElement(int[] arr) {
        int mid = arr.length / 2;
        if (arr.length % 2 == 0) {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        } else {

            return arr[mid];
        }
    }

    public static void main(String[] args) {

        int[] array1 = {3, 1, 2, 0};
        int[] array2 = {1, 3, 2, 0, 5};

        System.out.println("Results for Array 1:");
        displayResults(array1);

        System.out.println("\nResults for Array 2:");
        displayResults(array2);
    }


    public static void displayResults(int[] arr) {
        System.out.println("Total Elements: " + getTotalElements(arr));
        System.out.println("Average: " + getAverage(arr));
        System.out.println("Maximum Value: " + getMaxValue(arr));
        System.out.println("Minimum Value: " + getMinValue(arr));
        System.out.println("Middle Element: " + getMiddleElement(arr));
    }
}
