package q01;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Pedido> pedidos = new ArrayList<Pedido>();
    private Cliente cliente;
    final double DESCONTO = 0.1;

    Venda(Cliente cliente){
        this.cliente = cliente;
    }

    public void processarPedido(Pedido pedido) {
        pedidos.add(pedido);
        calcularDesconto(pedido);
    }

    public double calcularDesconto(Pedido pedido) {
        return pedido.getValorTotal() * DESCONTO;
    }

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


}
