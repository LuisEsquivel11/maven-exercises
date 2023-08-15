import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class NewClass {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter something.");
        String userInput = scanner.nextLine();
        System.out.println("You Entered: " + userInput);
        System.out.println("Numeric: " + StringUtils.isNumeric(userInput));
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }

//Enter Something: Life, The Universe, and Everything
//You Entered: "Life, The Universe, and Everything"
//"Life, The Universe, and Everything" is not a number
//Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//Reversed: gnihtyrevE dna ,esrevinU eht ,efiL
}
