public class PasswordChecker {
    public static int CheckPassword(char[] str, int n) {
        if (n < 4) {
            return 0; // At least 4 characters required
        }

        boolean hasNumericDigit = false;
        boolean hasCapitalLetter = false;

        for (int i = 0; i < n; i++) {
            char ch = str[i];

            if (Character.isDigit(ch)) {
                hasNumericDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasCapitalLetter = true;
            }

            if (Character.isWhitespace(ch) || ch == '/') {
                return 0; // Must not have space or slash (/)
            }

            if (i == 0 && Character.isDigit(ch)) {
                return 0; // Starting character must not be a number
            }
        }

        // Check if all conditions are satisfied
        if (hasNumericDigit && hasCapitalLetter) {
            return 1; // Valid password
        } else {
            return 0; // Invalid password
        }
    }

    public static void main(String[] args) {
        char[] password1 = "Abcdef12".toCharArray();
        char[] password2 = "Password123".toCharArray();
        char[] password3 = "Pass/word".toCharArray();
        char[] password4 = "Ab1/".toCharArray();

        System.out.println("Password1: " + CheckPassword(password1, password1.length));
        System.out.println("Password2: " + CheckPassword(password2, password2.length));
        System.out.println("Password3: " + CheckPassword(password3, password3.length));
        System.out.println("Password4: " + CheckPassword(password4, password4.length));
    }
}
