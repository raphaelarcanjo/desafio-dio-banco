public class Main {
    public static void main(String[] args) {
        Banco bancoRaphael = new Banco();

        Cliente cliente = new Cliente();
        cliente.setCpf("123-456-789-10");
        cliente.setNome("Maria");

        Poupanca poupanca = new Poupanca(cliente, 110.59);
        poupanca.imprimirExtrato();

        bancoRaphael.adicionarConta(poupanca);
    }
}