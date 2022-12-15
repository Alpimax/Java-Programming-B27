package solutions;

import java.util.Scanner;

public class SecondsConvertor {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter seconds:");
//        int inputSeconds = input.nextInt();
//
//        int hours = inputSeconds / 3600; // 60 * 60 = 3600 -> 60 seconds in a minutes, 60 minutes in an hour
//        inputSeconds %= 3600; // find left over number of seconds after the seconds were used for hours
//        int minutes = inputSeconds / 60; // 60 seconds in a minute
//        inputSeconds %= 60; // left over is how many seconds we have that weren't used for hours or minutes

//        System.out.println(hours + " hours, " + minutes + " minutes, and " + inputSeconds + " seconds");

//        System.out.println(sumNumbers("abc123xyz"));  //→ 123

        System.out.println(notReplace("This is right"));
        //→ "This is not right");

    }

    public static String notReplace(String str) {
        String alper = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (("" + str.charAt(i) + str.charAt(i + 1)).equals("is")) {
                alper = str.replaceFirst("is", "is not");
                i++;
                i++;

            }
        }
        return alper;
    }
}