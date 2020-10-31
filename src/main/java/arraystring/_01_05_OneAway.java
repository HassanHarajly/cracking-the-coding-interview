package arraystring;





import java.util.*;


/**
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * <p>
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
class _01_05_OneAway {
    boolean isOneAway(String a, String b) {
        Set<Character> hs1 = new HashSet<Character>();
        Set<Character> hs2 = new HashSet<Character>();
        hs1.addAll(convertToSet(a.toCharArray()));
        hs2.addAll(convertToSet(b.toCharArray()));
        Set<Character> hs1Copy = new HashSet<Character>(hs1);

        hs1.removeAll(hs2);
        hs2.removeAll(hs1Copy);

        if ((hs1.size() ==0 && hs2.size() ==1) || (hs2.size() ==0 && hs1.size() ==1))
        {
            return true;
        }
        else if (hs1.size()==1 && hs2.size()==1)
        {
            return true;
        }
        else if (hs1.size()==0 && hs2.size() ==0)
            return true;
        return false;
    }


    public static Set convertToSet(char[] charArray) {

        // Result hashset
        Set resultSet = new HashSet();

        for (int i = 0; i < charArray.length; i++) {
            resultSet.add(new Character(charArray[i]));
        }

        // Return result
        return resultSet;
    }

}
