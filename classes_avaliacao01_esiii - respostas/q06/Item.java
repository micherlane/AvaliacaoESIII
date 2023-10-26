package q06;

public class Item implements CalculoTotal{
	String id;
	String descricao;
	double valor;
	public Item(String id, String descricao, double valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}
	@Override
	public double calcularTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
