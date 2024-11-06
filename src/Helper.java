import java.util.Scanner;


    public class Helper {
        private static final Scanner scanner = new Scanner(System.in);

        public static String getInput(String prompt) {
            System.out.print(prompt);
             return scanner.nextLine();
        }

        public static int getIntInput(String prompt) {
            System.out.print(prompt);
            return  scanner.nextInt();
        }

        public static void closeScanner() {
        scanner.close();
        }
    }

