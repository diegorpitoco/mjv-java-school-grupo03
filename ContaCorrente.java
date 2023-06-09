class ContaCorrente{
    int numConta;
    int numeroAgencia;

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public double transferirParaOutraConta(double valorTransferencia){
        return saldo -= valorTransferencia;
    }

}
