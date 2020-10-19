package arraystring;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 */

// hassan wrote this, all other files that dont have this comment are from the original repo that was forked
class _01_04_PalindromePermutation {
    boolean check(String s) {
        Hashtable<Character, Integer> lettersCount = new Hashtable<>();
        int odd = 0;
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {

            if (lettersCount.get(Character.toLowerCase(charArr[i])) != null) {
                lettersCount.put(Character.toLowerCase(charArr[i]), lettersCount.get(Character.toLowerCase(charArr[i])) + 1);
            } else {
                lettersCount.put(Character.toLowerCase(charArr[i]), 1);
            }
        }
        Set<Character> keys = lettersCount.keySet();
        for (Character key : keys) {
            if ((int)key >= 97 && (int)key<=122 || (int)key >= 65 && (int)key<=90|| (int)key >= 48 && (int)key<=57) {
                if (!(lettersCount.get(key) % 2 == 0)) {
                    odd++;
                }
            }
        }
        if (odd == 1 || odd == 0) {
            return true;
        }
        return false;
    }
}
