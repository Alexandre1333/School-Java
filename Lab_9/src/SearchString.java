public class SearchString {

    public static int searchString(String[] arr, String searchVal) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(searchVal)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"Bob", "Susan", "Bill", "Karen"};
        String searchVal = "Karen";
        int index = searchString(arr, searchVal);
        System.out.println("Index of \"" + searchVal + "\": " + index);
    }
}

