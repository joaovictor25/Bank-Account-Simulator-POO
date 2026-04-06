public class ServiceAccount{
    private double depositoAtual = 0;

    public double calcularDeposito(double deposito){
        return depositoAtual = depositoAtual + deposito;
    }

    public double sacar(double valorSacar){
        return depositoAtual - valorSacar;
    }
}