package Filter;

/**
 * Created by ihgorek on 7/11/17.
 */
public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;
    private String data;

    public TooLongTextAnalyzer(int maxLength){
        this.maxLength= maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength){
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }
    }

}
