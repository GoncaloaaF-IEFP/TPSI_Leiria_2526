public class InvalidParamException extends Exception{

    @Override
    public String getMessage() {
        return "o valor tem de ser maior de 0";
    }
}
