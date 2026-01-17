public class MainCalculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator(); // ✅ création de l’objet

        // Test division
        System.out.println("Division 10 / 2 = " + calc.divide(10, 2));
        System.out.println("Division 10 / 0 = " + calc.divide(10, 0));

        // Test conversion
        System.out.println("Convert '123' = " + calc.convertToNumber("123"));
        System.out.println("Convert 'abc' = " + calc.convertToNumber("abc"));

        // Test calculate
        System.out.print("5 + 3 = ");
        calc.calculate("+", 5, 3);

        System.out.print("5 - 3 = ");
        calc.calculate("-", 5, 3);

        System.out.print("5 * 3 = ");
        calc.calculate("*", 5, 3);

        System.out.print("5 / 0 = ");
        calc.calculate("/", 5, 0);

        System.out.print("5 & 3 = ");
        calc.calculate("&", 5, 3);
    }
}

