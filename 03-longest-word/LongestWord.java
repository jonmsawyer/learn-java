/**************************************************************************************************
 * File: LongestWord.java
 *
 * Find the Longest Word in a String
 * 
 * In this exercise, we're going to perform more string manipulation and searching. Have the
 * function LongestWord(sen) take the `sen` parameter being passed and return the largest word in
 * the string. If there are two or more words that are the same length, return the first word from
 * the string with that length. Ignore punctuation and assume `sen` will not be empty. Assume an
 * ASCII only character set (no need to worry about foreign languages or unicode.
 *
 * Sample Test Cases
 * -----------------
 *
 * Input: "fun&!! time"
 * Output: "time"
 *
 * Input: "I love dogs"
 * Output: "love"
 *
 * How I will be "grading" your work
 * ---------------------------------
 *
 * 1. (1 pt) Unglob all imports. Always unglob. Always use specific imports so the population
 *    of the namespace is explicit, rather than ambiguous.
 * 2. (18 pts) In every excercise, I am going to make code cleanliness, indentation, variable
 *    readability, comments, etc. to be worth 50% of the points. This is because people must read
 *    and write your code and seasoned programmers (yourself included after a while) will abhor
 *    unclean code. You will come to appreciate thoughtful, expressive, organized, and documented
 *    code throughout your programming journey and it's best to gain the discipline now, rather
 *    than later. Things to correct and watch out for:
 *    a) All indents must be 4 spaces. Do not use tabs. (Hint: in this exercise I am giving you
 *       code that is formatted to 2 spaces for indents...)
 *    b) Remove all extra whitespace at the end of every line. Whitespace usage on blank lines to
 *       keep indentation from prior lines is OK.
 *    c) Provide empty line spacing around groups of related code. Put spacing around classes,
 *       method and function definitions, etc.
 *    d) Refactor ("refactor" in programming parlance is to rename, reclassify, or recode some
 *       piece of your code *without* changing the way that object interacts with your code) any
 *       odd variable names. All variable names should self document and provide some form of
 *       clarity as to what its function is. This part is really an art form so don't stress too
 *       much about it. (Hint: in this exercise there's a String variable called "sen". Wut?)
 *    e) !!Documentation, documentation, documenation!! Even though these exercises are relatively
 *       small in scope, from now on, let's assume that you're programming a small, reusable,
 *       code library that others will look at and use. Other programmers must be able to grok your
 *       code effectively (it's not an easy task to just read a piece of code and inherently know
 *       what it does -- that comes with experience). Assume that, for the most part, your audience
 *       are fellow programmers in your shop. Your goal is to provide enough documentation in your
 *       code such that no one needs to come to you for an explaination on what your code is doing.
 *       Furthermore, when you come back to this library months or years later, you won't remember
 *       much about your code so you'll end up trying to grok your own code (and then wonder what
 *       noobie wrote this monstrosity all to realize it was you, hehe [true story, many times]).
 *       Also, begin reading up on and learning "javadoc" style of documentation. A simple
 *       "javadoc" comment block is included for you.
 * 3. (6 pts) Efficiency of code. Is your code expressive? Does it really take 200 lines of code
 *    to do this one search algorithm or is there a more efficient way of performing the task? Does
 *    your code enslave the processor unnecessarily? Always think of ways to do the most amount of
 *    work with the least amount of code and processor time. (This will be a skill I'll help you
 *    out with over the course of doing these exercises. The science of mathematical, programmatic,
 *    and physical efficiency of algorithms is the heart of "Computer Science". There is useful
 *    information to be learned in this field.)
 *    a) 3 points will go toward efficiency regarding how your code is written. (Less is more.)
 *    b) 3 points will go toward efficiency regarding how un-busy your processor is throughout the
 *       runtime of your program. (Less is more.)
 * 4. (10 pts) Correct solution. Your solution must correctly parse and find the longest word in
 *    any arbitrary string, including but not limited to the test cases above. Pay attention to
 *    any assumptions outlined in the exercise and/or in the code itself. If you assume something
 *    not listed, document it. Be prepared to injest this entire exercise as well :)
 * 5. (1 pt) Have fun! Please let me know if you have any questions.
 * 6. (5 pts extra credit) Provide another (correct) method within the LongestWord class,
 *    LongestWordAlternate, which computes the longest word in an arbitrary string, but make the
 *    solution fundamentally different in approach. So let's see another "way" of solving this
 *    problem!
 *
 * Total number of possible points: 36 + 5
 *************************************************************************************************/

import java.util.*; 
import java.io.*;

class LongestWord {

  /**
   * Returns a String object whos value is the longest word in the given string. The `sen`
   * parameter must not be null or empty.
   *
   * @param  sen  an arbitrary, non-null, non-empty String to search
   * @return      a String containing the longest word in `sen`
   */
  public static String LongestWord(String sen) {
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    return sen;
  } 
  
  public static void main (String[] args) {  
    // Do not modify this method.
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   

}

