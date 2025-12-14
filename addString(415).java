import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {

        if (num1.length() >= 1 && num1.length() <= 10000 &&
            num2.length() >= 1 && num2.length() <= 10000) {

            BigInteger x = new BigInteger(num1);
            BigInteger y = new BigInteger(num2);

            BigInteger sum = x.add(y);

            return sum.toString();
        } 
        else {
            return "0";
        }
    }
}
