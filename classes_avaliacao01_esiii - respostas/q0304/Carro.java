package q0304;

public class Carro {
    double quantidadeCombustivel;
    double capacidadeMaxima = 50; // em litros

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void abastecerCombustivel(int quantidade){
        if(this.quantidadeCombustivel > quantidade){
            throw new RuntimeException("Capacidade máxima atingida");
        }

        if(this.quantidadeCombustivel + quantidade > this.capacidadeMaxima){
            throw new RuntimeException("Capacidade máxima atingida");
        }

        this.quantidadeCombustivel += quantidade;
    }
    
}

