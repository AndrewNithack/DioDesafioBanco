public class ContaPoupaca extends Conta {
    public ContaPoupaca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }

}
