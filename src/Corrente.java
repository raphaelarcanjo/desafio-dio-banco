public class Corrente extends Conta {

    Corrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("Essa é a conta corrente do cliente ".concat(this.cliente.getNome()));
        super.imprimirExtrato();
    };

}
