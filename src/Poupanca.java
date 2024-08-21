public class Poupanca extends Conta {

    Poupanca(Cliente cliente, double novoSaldo) {
        super(cliente);
        this.depositar(novoSaldo);
    }

    public void imprimirExtrato() {
        System.out.println("Essa é a conta poupança do cliente ".concat(this.cliente.getNome()));
        super.imprimirExtrato();
    };

}
