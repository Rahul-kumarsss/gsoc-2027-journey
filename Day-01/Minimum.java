public class Minimum {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 15, 7, 11};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number is: " + min);
    }
}