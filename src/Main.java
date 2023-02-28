
import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
            finally {
                System.out.println("This line is always executed.");
            }

        }

        return userInt;



    }

    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0.0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = scanner.nextLine();
            }
            finally {
                System.out.println("This line is always executed.");
            }

        }
            return userDouble;



    }

    public String promptString(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        String userString = " ";
        boolean isString  = false;
        while (!isString){
            try{
                userString = new String(userInput);
                isString = true;
            }
            catch (Exception e){
                System.out.println(userInput + " is not a valid String. " + message);
                userInput = scanner.nextLine();
            }
        }
        return userInput;
    }
}




    public class Main {
        public static void main(String[] args) {
            UserInput input = new UserInput();
            int aNumber = input.promptInt("Enter an integer.");
            System.out.println(aNumber);

            UserInput input1 = new UserInput();
            double bNumber = input1.promptDouble("Enter a double.");
            System.out.println(bNumber);

            UserInput input2 = new UserInput();
            String cString = input2.promptString("Enter a String.");
            System.out.println(cString);
        }
    }