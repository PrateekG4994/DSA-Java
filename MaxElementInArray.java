public class MaxElementInArray {
    public static void MaxInArray(int[] arr, int length) {
        if (length <= 0) {
            System.out.println("Invalid array length.");
            return;
        }

        int maxElement = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(maxElement);
        System.out.println(maxIndex);
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 82, 27, 66, 12, 78, 13, 71, 86};
        int length = arr.length;

        MaxInArray(arr, length);
    }
}
