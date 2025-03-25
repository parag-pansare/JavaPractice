package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class charCountinString {
	public static void main(String[] args) {
        String str = "test this string";
        String inp = str.toLowerCase();
        String input = inp.replace(" ", "");
        
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
