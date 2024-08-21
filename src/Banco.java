import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
        Cliente cliente = conta.getCliente();
        this.clientes.add(cliente);
        this.boasVindas(cliente);
    }

    private void boasVindas(Cliente cliente) {
        System.out.println("Seja bem-vindo(a) ".concat(cliente.getNome()));
    }

}
