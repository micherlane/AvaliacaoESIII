package q01;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido();
        Venda venda = new Venda(cliente);

        venda.processarPedido(pedido);
        System.out.println(venda.getPedidos());

    }
}
