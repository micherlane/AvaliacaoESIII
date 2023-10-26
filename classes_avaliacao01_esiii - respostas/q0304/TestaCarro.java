package q0304;

class TestaCarro {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.quantidadeCombustivel = 20;
    
        reabastecerSeNecessario(carro, 100);
    }

    public static void reabastecerSeNecessario(Carro c, int quantidade) {
        c.abastecerCombustivel(quantidade);
    }

}