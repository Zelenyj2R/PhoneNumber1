import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("phoneNumberFile.txt"))) {
            //String line = reader.readLine();
            while (reader.ready()) {
                String line = reader.readLine();
                if (ValidNumber(line)) {

                    System.out.println(line);
                }


            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }



    }
    public static boolean ValidNumber(String line) {
        Pattern pattern = Pattern.compile("^(\\d{3}-\\d{3}-\\d{4})$|^(\\(\\d{3}\\) \\d{3}-\\d{4})$");
        Matcher mt = pattern.matcher(line);
        return mt.find();
    }

}
