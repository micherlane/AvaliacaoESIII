package q05;

import java.util.Date;

public class Transacao {
    private double valor;
    private Date data;

    public Transacao(double valor, Date data) {
    	this.valor = valor;
    	this.data = data;
    }


    

    public double calcularTaxas(CalculoTaxaInterface calculadorTaxa) {
       return calculadorTaxa.calcularTaxa(valor);
    }

    public void salvar() {
    	String textoFormatoTransacao = FormatadorTransacao.formatarEmText(this);
    	ArmazenamentoArquivo.salvarTransacao(textoFormatoTransacao, "log_transacao.txt");	
    }


	public double getValor() {
		return valor;
	}




	public void setValor(double valor) {
		this.valor = valor;
	}




	public Date getData() {
		return data;
	}




	public void setData(Date data) {
		this.data = data;
	}
}
