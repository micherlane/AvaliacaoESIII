package q05;

public class Deposito implements CalculoTaxaInterface {
    double porcentagem;

    public double calcularTaxa(double valor){
        return valor * porcentagem;
    };
}
