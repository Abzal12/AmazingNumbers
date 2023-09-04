package numbers;

public class HelpSearching {
    static boolean checkForSpecificStringWhileSearching(String propertyName, StringBuilder stringBuilder) {

        boolean result = false;
        String sbToStr = stringBuilder.toString();
        String[] strArr = sbToStr.split(", ");
        for (String str : strArr) {

            if(propertyName.toLowerCase().equals(str)) {

                result = true;
                break;
            }
        }
        return result;
    }
    static boolean checkForForthElement(String[] propertyNames, String str) {
        boolean result = false;
        for (String s : propertyNames) {
            if (str.toLowerCase().equals(s)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
