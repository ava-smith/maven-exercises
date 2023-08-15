import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something:");
        String userString = scan.nextLine();
        System.out.println("You entered: " + userString);
        if(StringUtils.isNumeric(userString)) {
            System.out.println(userString + " is a number.");
        } else {
            System.out.println(userString + " is not a number");
        }
        System.out.println(StringUtils.swapCase(userString));
        System.out.println(StringUtils.reverse(userString));
    }
}
