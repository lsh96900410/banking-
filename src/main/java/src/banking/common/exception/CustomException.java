package src.banking.common.exception;

import lombok.NoArgsConstructor;
import src.banking.common.type.ExceptionType;

@NoArgsConstructor
public class CustomException extends RuntimeException{

    private ExceptionType type ;
    private String message;


    public CustomException(ExceptionType type, String value){
        this.type=type;
        this.message= replaceText(type.getMessage(),value);
    }

    public CustomException(ExceptionType exceptionType) {
    }

    @Override
    public String getMessage() {
        return message == null ? super.getMessage() : message;
    }

    private String replaceText(String text, String... values) {

        String replaceText = text;
        for (int i = 0; i < values.length; i++) {
            replaceText = replaceText.replaceAll("\\{" + i + "\\}" , values[i]);
        }

        return replaceText;
    }
}
