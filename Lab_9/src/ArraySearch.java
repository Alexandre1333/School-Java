public class ArraySearch {

    public static int searchValue(int[] arr, int searchVal) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == searchVal) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25};

        int searchVal = -40;

        int index = searchValue(arr, searchVal);

        System.out.println("Index of " + searchVal + ": " + index);
    }
}

