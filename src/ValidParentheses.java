public class ValidParentheses {

  public boolean isValid(String s) {
    while (true) {
      if (s.contains("()")) {
        s = s.replace("()", "");
      } else if (s.contains("{}")) {
        s = s.replace("{}", "");
      } else if (s.contains("[]")) {
        s = s.replace("[]", "");
      } else {
        return s.isEmpty();
      }
    }
  }
}
