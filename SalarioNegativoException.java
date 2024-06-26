public class SalarioNegativoException extends RuntimeException{
    @Override
    public String getMessage() {
        return "O salario não pode ser negativo";
    }
}
