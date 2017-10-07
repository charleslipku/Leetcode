import java.util.Set;
import java.util.HashSet;

class LongestSubstring003 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int max_length = 0, i = 0, j = 0;
        Set<Character> substring = new HashSet<>();
        while (i < length && j < length) {
        	if (!substring.contains(s.charAt(j))) {
        		substring.add(s.charAt(j++));
        		max_length = Math.max(max_length, j-i);
        	}
        	else {
        		substring.remove(s.charAt(i++));
        	}
        }
        return max_length;
    }

    public static void main(String[] args) {
    	LongestSubstring003 test = new LongestSubstring003();
    	System.out.println(test.lengthOfLongestSubstring("pwwkew"));
    }
}

