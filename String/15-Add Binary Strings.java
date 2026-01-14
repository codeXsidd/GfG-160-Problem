class Solution {
    String addBinary(String s1, String s2) {

        // Remove leading zeros
        s1 = s1.replaceFirst("^0+", "");
        s2 = s2.replaceFirst("^0+", "");

        if (s1.length() == 0) s1 = "0";
        if (s2.length() == 0) s2 = "0";

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {

            int bit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;

            int sum = bit1 + bit2 + carry;

            result.append(sum % 2);   // Current bit
            carry = sum / 2;          // Carry

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
