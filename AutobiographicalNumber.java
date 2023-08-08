public class AutobiographicalNumber {
    public static int FindAutoCount(String n) {
        int[] countArray = new int[10];

        // Count the occurrences of each digit in the input number
        for (int i = 0; i < n.length(); i++) {
            char digitChar = n.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            if (digit >= 0 && digit < 10) {
                countArray[digit]++;
            } else {
                return 0; // Invalid input
            }
        }

        StringBuilder distinctNumbers = new StringBuilder();
        int distinctCount = 0;

        // Check if the number is autobiographical and find the count of distinct
        // numbers
        for (int i = 0; i < countArray.length; i++) {
            int count = countArray[i];
            if (count > 0) {
                char digitChar = (char) ('0' + count);
                distinctNumbers.append(digitChar);
                distinctCount++;
            } else if (i == 0) {
                // The first digit cannot be zero in an autobiographical number
                return 0;
            }
        }

        // Check if the resulting string is equal to the input number
        if (n.equals(distinctNumbers.toString())) {
            return distinctCount;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String n1 = "1210";
        String n2 = "2020";
        String n3 = "3113";
        String n4 = "10111";

        System.out.println("n1: " + FindAutoCount(n1));
        System.out.println("n2: " + FindAutoCount(n2));
        System.out.println("n3: " + FindAutoCount(n3));
        System.out.println("n4: " + FindAutoCount(n4));
    }
}
