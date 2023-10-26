package q05;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
	Transacao transacao = new Transacao(50, new Date(2020,02,02));
       Deposito deposito = new Deposito();

       deposito.porcentagem = 0.1;
       
       System.out.println(transacao.calcularTaxas(deposito));

       System.out.println(transacao.getValor());
       
       transacao.salvar();
       
    }
}
