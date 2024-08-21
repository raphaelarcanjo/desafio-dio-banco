public abstract class Conta implements IConta {
    protected final int AGENCIA = 1;
    protected int NUMERO;
    protected Cliente cliente;
    private double saldo = 0;

    Conta(Cliente cliente) {
        this.cliente = cliente;
        this.NUMERO++;
    }

    public int getAGENCIA() {
        return AGENCIA;
    }

    public int getNUMERO() {
        return NUMERO;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimirExtrato() {
        System.out.println(String.format("Conta de número: %d", this.NUMERO));
        System.out.println(String.format("Agência número: %d", this.AGENCIA));
        System.out.println(String.format("Saldo em conta: %.2f", this.saldo));
    };

    public void depositar(double valor) {
        this.saldo += valor;
    };

    public void sacar(double valor) {
        this.saldo -= valor;
    };

    public void transferir(double valor, Conta conta) {
        this.saldo -= valor;
        conta.depositar(valor);
    };

}
