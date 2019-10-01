package es.ulpgc;

public class FizzBuzz {

    public static String of(int number) {
        return isSpecial(number) ? specialValueOf(number) : String.valueOf(number);
    }

    private static String specialValueOf(int number) {
        return fizzOf(number) + buzzOf(number);
    }

    private static boolean isSpecial(int number) {
        return isMultipleOfThree(number) || isMultipleOfFive(number);
    }

    private static boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private static boolean isMultipleOfThree (int number) {
        return number % 3 == 0;
    }

    private static String fizzOf(int number) {
        return isMultipleOfThree(number) ? "Fizz" : "";
    }

    private static String buzzOf(int number) {
        return isMultipleOfFive(number) ? "Buzz" : "";
    }
}
