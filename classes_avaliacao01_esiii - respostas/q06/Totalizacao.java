package q06;

public class Totalizacao {



    public double totalizar(Item[] itens) {
    	double total = 0;
    	for (Item item : itens) {
    		total += item.calcularTotal();
    	}
    	return total;
    	}
}
