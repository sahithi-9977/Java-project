package Exceptions;
public class ConvertStringToInt {
        public static void main(String[] args) {
            // Call the method with different inputs and print the return value or exception
            printConvertedValue("23");
            printConvertedValue("45.67");
            printConvertedValue("test");
            printConvertedValue("123f");
        }

        public static void printConvertedValue(String input) {
            try {
                int value = convertToInt(input);
                System.out.println("Input: " + input + ", Converted Value: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Input: " + input + ", Exception: " + e.getMessage());
            }
        }

        public static int convertToInt(String input) throws NumberFormatException {
            return Integer.parseInt(input);
        }
    }

