package vitalify.asia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String content = "This is Gau nau from Beginnersbook.com";

        String pattern = ".*book.*";

        boolean isMatch = Pattern.matches(pattern, content);

        System.out
                .println("The text contains 'book'? => " + isMatch);
        /*
         * Pattern used for defining patterns
         * Matcher used for performing match operation on text using patterns
         *
         */

        String content1 = "This is a tutorial website!";
        String pattern1 = ".*tuToriAl.*";

        Pattern pattern2 = Pattern.compile(pattern1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern2.matcher(content1);

        boolean isMatch1 = matcher.matches();

        System.out.println("Is it a match => " + isMatch1);

        /*
         * Predefined char classes - metacharacters
         * . -> Any char
         * \d -> a digit [0-9]
         * \D -> a non digit [^0-9]
         * \s -> a white space char [\t\n\x0B\f\r]
         * \S -> a non-whitespace char [^\s]
         * \w -> a word character [a-zA-Z_0-9]
         * \W -> a non word character [^\w]
         * */

        System.out.println("(\"\\d, 1\") => " + Pattern.matches("\\d", "1"));
        System.out.println("(\"\\D, z\") => " + Pattern.matches("\\D", "z"));
        System.out.println("(\".p, qp\") => " + Pattern.matches(".p", "qp"));

        /*
         * Boundary Matchers
         * ^ -> match the begining of a line.
         * $ -> match the end of a line
         * \b -> match a word boundary
         * \B -> match a non-word boundary
         * \A -> match the begining of the input text
         * \G -> match the end of the previous match
         * \Z -> match the end of the input text except the final terminator if any
         * \z -> match the end of the input text
         * */

        /*
         * Quantifiers
         *
         * */

    }
}
