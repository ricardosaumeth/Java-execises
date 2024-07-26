public class FindIndexFirstOccurrence {

  public int firstOccurrence(String haystack, String needle) {
    for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
      if (haystack.substring(i, j).equals(needle)) {
        return i;
      }
    }
    return -1;
  }
}
