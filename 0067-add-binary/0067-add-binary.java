class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String str1 = "", str2 = "";
        if (a.length() > b.length()) {
            str1 = a;
            str2 = b;
        } else {
            str1 = b;
            str2 = a;
        }
        StringBuilder sb = new StringBuilder();
        // System.out.println(str1+" "+str2);
        int j = str1.length()-1;
        for (int i = str2.length() - 1; i >= 0; i--, j--) {
            char currCharB = str2.charAt(i);
            char currCharA = str1.charAt(j);
            // System.out.println(currCharA+" "+currCharB);
            if (currCharB == '1' && currCharA == '1' && carry == 0) {
                sb.append(0);
                carry = 1;
            } else if (currCharA == '1' && currCharB == '1' && carry == 1) {
                sb.append(1);
                carry = 1;
            } else if ((currCharA == '1' || currCharB == '1') && carry == 0) {
                sb.append(1);
                carry = 0;
            } else if ((currCharA == '1' || currCharB == '1' )&& carry == 1) {
                sb.append(0);
                carry = 1;
            } else if ( (currCharA == '0' && currCharB == '0') && carry == 1) {
                sb.append(1);
                carry = 0;
            } else {
                sb.append(0);
            }
            System.out.println(carry);
        }
        System.out.println(sb+" "+j+" "+carry);

        while (j >= 0) {
            if (str1.charAt(j) == '1' && carry == 1) {
                sb.append(0);
            } else if (str1.charAt(j) == '0' && carry == 1) {
                sb.append(1);
                carry = 0;
            } else if(str1.charAt(j) == '1' && carry == 0) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            j--;
        }
        if (carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}