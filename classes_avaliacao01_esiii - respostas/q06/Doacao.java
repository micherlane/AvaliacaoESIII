package q06;

public class Doacao extends Item {
   
    private double bonus;

    public Doacao(String id, String descricao, double valor, double bonus) {
        super(id, descricao, valor);
        this.bonus = bonus;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public double getBonus() {
        return bonus;
    }

	
}