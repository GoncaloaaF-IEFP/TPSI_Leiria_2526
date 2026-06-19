public class NumeroNegativoException extends Exception {

    @Override
    public String getMessage() {
        return "O número e negativo, devia ser positivo";
    }
}
