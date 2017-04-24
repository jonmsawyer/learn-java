/**
 * For this exercise, we have a class called FirstReverse with a main() function and a public
 * String firstReverse() function. Fill out the code in the firstReverse() function to return a
 * String whos contents are reversed. For example, "Hello world!" should return "!dlrow olleH".
 *
 * Hint: you do not need to return the str object...
 *
 * To complete this exercise:
 *   1. Expand all imports and leave no import globbed (java.util.* is a glob)
 *   2. Modify only the firstReverse() function and return a reversed string
 *   3. Keep your source code properly indented and clean. I would like to see you comment your
 *      code. See if you can come up with a comfortable and consistent way to do inline comments:
 *          String foo = "foo"; // this is an inline comment
 *      as well as block comments:
 *          /****************************
 *           * this is a block comment **
 *           *************************** / <-- I leave a space here because it would cut off the
 *                                             rest of the block comment you're reading now.
 *          int myCodeHere = 0x20;
 */

import java.util.Scanner;

class FirstReverse {
    
    /**
     * Return the input string in its reversed order.
     *
     * @param  str  the input string to reverse
     * @return      the input string reversed
     */
    public static String firstReverse(String str) {
        // Create a new string
        String rev = "";
        
        // Iterate over the input string (in reverse) according to its length
        for (int i = str.length() - 1; i >= 0; i--) {
            // Build up the reversed string character-by-character
            rev += str.substring(i, i + 1);
        }
        return rev;
    }
    
    public static void main (String[] args) {
        // Do not modify this method.
        Scanner s = new Scanner(System.in);
        System.out.print("Input a sentence, and I'll output that sentence in reverse: ");
        System.out.print(firstReverse(s.nextLine()));
    }

}

/**
 * Discussion for after a correct solution has been found:
 *   1. Now that you know how to reverse a string, can you think of ways to optimize your
 *      algorithm? Do you know of any ways to reduce the amount of code you've written? How many
 *      lines did you use and how many do you think could be minimally used? Hint: I used 5 lines
 *      (without comments) of readable, clean, code.
 *   2. Which control structures, if any, did you use in your algorithm? Why did you choose that
 *      structure? Is there a better, more elegant, structure?
 *   3. Using glob based imports (java.util.*) as opposed to explicit imports (java.util.Scanner)
 *      can be problematic. Why? Let's discuss this point in philosophy.
 *   4. What advantages are there for having clean, consistent, readable code? What are some
 *      disadvantages?
 *      a) Question: Who interacts with your code more: you (the writer) or everyone
 *                   else (the reader)? Knowing this, what can we do help the widest audience
 *                   do cool stuff with your code?
 */

