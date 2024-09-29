public class NumberToWords {
    private static final String[] belowTen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] belowTwenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] belowHundred = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String numberToWords(int num) {
        if (num == 0) return "Zero";
        return helper(num);
    }

    private static String helper(int num) {
        if (num < 10) return belowTen[num];
        else if (num < 20) return belowTwenty[num - 10];
        else if (num < 100) return belowHundred[num / 10] + " " + helper(num % 10);
        else if (num < 1000) return belowTen[num / 100] + " Hundred " + helper(num % 100);
        else return "";
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(123));  // Output: "One Hundred Twenty-Three"
    }
}
