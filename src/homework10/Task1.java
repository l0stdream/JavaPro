package homework10;


public class Task1 {

    public static boolean isPalindrome(String palindrome) {
        StringBuilder result = new StringBuilder(palindrome
                .replaceAll("[^A-Za-z0-9]", "")
                .toLowerCase());
        System.out.println(result);
        System.out.println(result.reverse());
        return
                result.toString()
                        .equals(String.valueOf(result.reverse()));
    }


    public static boolean isPalindrome2(String palindrome) {
        String result = makeAlphanumeric(palindrome).toLowerCase();
        int left = 0;
        var right = Math.max(result.length() - 1, 0);
        while (left < right) {
            if (result.charAt(left) != result.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }


    /**
     * That method was created in case if we weren't allowed to use regex.
     * (I know about Character.isLetterOrDigit(), but I decided to do with my own method)
     */

    private static String makeAlphanumeric(String nonAlphanumeric) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nonAlphanumeric.length(); i++) {
            char currentChar = nonAlphanumeric.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z' || currentChar >= 'a' && currentChar <= 'z'
                    || currentChar >= '0' && currentChar <= '9') {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

}
