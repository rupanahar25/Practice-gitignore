import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeGitIgnore {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the first string: ");
            String firstString = reader.readLine();

            System.out.print("Enter the second string: ");
            String secondString = reader.readLine();

            String concatenatedString = firstString + " " + secondString;

            System.out.println("Concatenated String: " + concatenatedString);
        } catch (IOException e) {
            System.out.println("An error will be  occurred while reading input.");
            e.printStackTrace();}
    }
}
