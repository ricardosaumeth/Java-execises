import java.util.Arrays;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] result = s.split(" ");
        return result[result.length - 1].length();
    }
}
