import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int calculate(String str) {
        int result = 0;

        if(!isValidInput(str)) {
            return result;
        }

        String[] list = extractStringsByUsingRegex(str);

        try {
            result = getNumberFromStringList(result, list);
        } catch (ClassCastException e) {
            throw new RuntimeException();
        }

        return result;
    }

    private String[] extractStringsByUsingRegex(String str) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(str);

        if(matcher.find()) {
            String customDelimiter = matcher.group(1);
            return matcher.group(2).split(customDelimiter);
        }

        return str.split("[,:]");
    }

    private boolean isValidInput(String str) {
        if(str == null) return false;
        if(str.length() == 0) return false;
        return true;
    }

    private int getNumberFromStringList(int result, String[] list) {
        for(String s : list) {
            result += Integer.parseInt(s);
        }
        return result;
    }
}
