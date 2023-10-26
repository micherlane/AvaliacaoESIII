package q05;

public class FormatadorTransacao {
	public static String formatarEmText(Transacao t) {
		return "Data: " + t.getData() + ", Valor: " + t.getValor() + "\n";
	}
}
