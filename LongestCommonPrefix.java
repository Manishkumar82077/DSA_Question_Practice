public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start by assuming the first string is the common prefix
        String prefix = strs[0];

        // Loop through each character of the prefix
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            System.out.println(c);

            // Compare this character with the same position in other strings
            for (int j = 1; j < strs.length; j++) {
                // If the current string is shorter or there's a mismatch, return the result
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    System.out.println(prefix.substring(0, i));
                    return prefix.substring(0, i);
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));  // Output: "fl"

        strs = new String[]{"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs));  // Output: ""
    }
}
