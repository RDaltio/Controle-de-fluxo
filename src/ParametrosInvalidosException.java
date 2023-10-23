public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() {
        System.out.println("Parâmetros inválidos: O segundo parâmetro deve ser maior que o primeiro");
    }

    public ParametrosInvalidosException(String mensagem) {
        System.out.println(mensagem);
    }
}
