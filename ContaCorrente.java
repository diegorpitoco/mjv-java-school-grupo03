import java.sql.Date;

public class ContaCorrente {

    int numeroConta;
    int numeroAgencia;
    String nomeCliente;
    Date dataNascimento;
    Double saldo;

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public double transferirParaOutraConta(int contaDestino, double valorTransferencia){
        return saldo -= valorTransferencia;
    }

    public void cancelarContaJustificativa(String justificativa) {
        if (saldo == 0.0) {
            System.out.println("Conta cancelada com sucesso. Justificativa: " + justificativa);
        } else {
            System.out.println("Não foi possível cancelar a conta. Saldo não zerado.");
        }
    }

    public void consultarExtratoEntreDatas(Date dataInicio, Date dataFim) {
        System.out.println("Extrato entre as datas " + dataInicio + " e " + dataFim);
        // Implementar lógica para consulta.
    }

    public void consultarSaltoAtual(double saldo) {
        System.out.println("Saldo atual: R$" + saldo);
    }

}