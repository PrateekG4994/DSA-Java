public class BinaryStringOperations {
    public static int OperationsBinaryString(String str) {
        if (str == null) {
            return -1;
        }

        int len = str.length();
        int result = 0;
        char currentOperator = 'I'; // Initialize with an initial operation

        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);

            if (currentChar == 'A') {
                currentOperator = 'A';
            } else if (currentChar == 'B') {
                currentOperator = 'B';
            } else if (currentChar == 'C') {
                currentOperator = 'C';
            } else {
                int binaryValue = Character.getNumericValue(currentChar); // Convert char to binary value (0 or 1)

                switch (currentOperator) {
                    case 'A':
                        result &= binaryValue; // Perform AND operation
                        break;
                    case 'B':
                        result |= binaryValue; // Perform OR operation
                        break;
                    case 'C':
                        result ^= binaryValue; // Perform XOR operation
                        break;
                    default:
                        // Invalid operation in the input string
                        return -1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "ICOCICIAOBI";
        int result = OperationsBinaryString(str);
        System.out.println("Result: " + result);
    }
}
