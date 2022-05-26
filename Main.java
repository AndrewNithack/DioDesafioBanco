public class Main {
    public static void main(String[] args) {
       Cliente andrew = new Cliente();
       andrew.setNome("Andrew");

        Conta cc= new ContaCorrente(andrew);
        Conta poupanca = new ContaPoupaca(andrew);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
