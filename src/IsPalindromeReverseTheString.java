public class IsPalindromeReverseTheString {
    public boolean isPalindromeReverseTheString(String text) {
        String spacesRemoved = text.replaceAll("//s+", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(spacesRemoved).reverse();
        return reversed.toString().equals(spacesRemoved);
    }
}
//public class IsPalindromeReverseTheString {
//    public boolean isPalindromeReverseTheString(String text) {
//        StringBuilder reverse = new StringBuilder();
//        String spacesRemoved = text.replaceAll("\\s+", "").toLowerCase();
//        char[] charArray = spacesRemoved.toCharArray();
//        for (int i = charArray.length - 1; i >= 0; i--)
//        {
//            reverse.append(charArray[i]);
//        }
//        return reverse.toString().equals(spacesRemoved);
//    }
//}
