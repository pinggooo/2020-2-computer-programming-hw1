public class FractionalNumberCalculator {
    public static void printCalculationResult(String equation) {
        String numerator1 = new String();
        String numerator2 = new String();
        String denominator1 = new String();
        String denominator2 = new String();
        String operator = new String();

        int index1 = 0;

        while(equation.charAt(index1) != '/') {
            if(equation.charAt(index1) == ' '){
                break;
            }
            index1 = index1 + 1;
        }


        numerator1 = equation.substring(0, index1);


        int index2 = index1 + 1;

        if(equation.charAt(index1) == ' ') {
            denominator1 = "1";
            index2 = index1;
        }
        else {
            while (equation.charAt(index2) != ' ') {
                index2 = index2 + 1;
            }
            denominator1 = equation.substring(index1+1, index2);
        }


        operator = equation.substring(index2+1, index2+2);


        int index3 = index2 + 3;

        while(equation.charAt(index3) != '/') {
            if(index3 == equation.length()-1) {
                numerator2 = equation.substring(index2+3);
                break;
            }
            else {
                index3 = index3 + 1;
                numerator2 = equation.substring(index2+3, index3);
            }
        }


        int index4 = index3 + 1;

        if(index3 == equation.length()-1){
            denominator2 = "1";
        }
        else {
            while (index4 != equation.length()) {
                index4 = index4 + 1;
            }
            denominator2 = equation.substring(index3+1);
        }


        int intNumerator1 = Integer.parseInt(numerator1);
        int intNumerator2 = Integer.parseInt(numerator2);
        int intDenominator1 = Integer.parseInt(denominator1);
        int intDenominator2 = Integer.parseInt(denominator2);
        char charOperator = operator.charAt(0);


        FractionalNumber FN = new FractionalNumber();
        FN.fractionalNumber(intNumerator1, intNumerator2, intDenominator1, intDenominator2, charOperator);

    }
}


class FractionalNumber {
    private int numerator;
    private int denominator;

    public void fractionalNumber (int numerator1, int numerator2, int denominator1, int denominator2, char operator) {

        int gcd;

        denominator = denominator1 * denominator2;


        switch(operator) {
            case '+':
                numerator = numerator1*denominator2 + numerator2*denominator1;
                break;
            case '-':
                numerator = numerator1*denominator2 - numerator2*denominator1;
                break;
            case '*':
                numerator = numerator1 * numerator2;
                break;
            default:
                numerator = numerator1 * denominator2;
                denominator = numerator2 * denominator1;
                break;
        }

        if(numerator < 0) {
            numerator = -(numerator);
            gcd = gcdCalculate(numerator, denominator);
            numerator = numerator / gcd;
            denominator = denominator / gcd;
            if(denominator == 1) System.out.println("-" + numerator);
            else System.out.println("-" + numerator + "/" + denominator);
        }
        else if(numerator == 0) {
            System.out.println("0");
        }
        else {
            gcd = gcdCalculate(numerator, denominator);
            numerator = numerator / gcd;
            denominator = denominator / gcd;
            if(denominator == 1) System.out.println(numerator);
            else System.out.println(numerator + "/" + denominator);
        }
    }

    private static int gcdCalculate (int a, int b) {
        int temp;

        if(a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if(a % b == 0) return b;
        else return gcdCalculate(b, a%b);
    }
}