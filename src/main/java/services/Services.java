package services;

/**
 * Created by Admin on 05.10.2014.
 */
public class Services {

    public Services() {
    }

    public String getLoopCode(String code, int currPositionInCode) {

        int resultSringLength = 0;
        int innerLoop = 0;

        for (int i = currPositionInCode; i < code.length(); i++) {
            resultSringLength++;
            switch (code.charAt(i)) {
                case '[':
                    innerLoop++;
                    break;
                case ']':
                    innerLoop--;
                    break;
            }
            if (innerLoop == 0)
                break;
        }
        String resultCode = code.substring(currPositionInCode + 1, currPositionInCode + resultSringLength - 1);
        return resultCode;
    }
}
