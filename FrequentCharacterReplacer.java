public class FrequentCharacterReplacer {
    public static String FrequentCharacterReplaced(String str, char x) {
        if (str == null || str.isEmpty()) {
            return str; // Return the input string if it is null or empty
        }

        int[] charCount = new int[256]; // Assuming ASCII characters, initialize all counts to 0
        int maxCount = 0;
        char mostFrequentChar = 0;

        // Count the occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount[ch]++;

            if (charCount[ch] > maxCount || (charCount[ch] == maxCount && ch < mostFrequentChar)) {
                maxCount = charCount[ch];
                mostFrequentChar = ch;
            }
        }

        // Replace the most frequent character with the given character 'x'
        char[] resultArray = str.toCharArray();
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] == mostFrequentChar) {
                resultArray[i] = x;
            }
        }

        return new String(resultArray);
    }

    public static void main(String[] args) {
        String str = "Accenture";
        char x = '*';

        System.out.println("Original String: " + str);
        String result = FrequentCharacterReplaced(str, x);
        System.out.println("Replaced String: " + result);
    }
}
