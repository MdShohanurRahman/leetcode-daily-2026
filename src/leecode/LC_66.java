package leecode;

public class LC_66 {
    public int[] plusOne(int[] digits) {
        // iterate from the least significant digit to most significant
        for (int i = digits.length - 1; i >= 0; i--) {
            // if digit is 9 it becomes 0 and carry continues
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                // found a non-9 digit, increment and return (no further carry)
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        // all digits were 9 -> create new array with leading 1 (e.g., 999 -> 1000)
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
