public class Moto extends Veiculo {
    private int cilindradas;

    public void setCilindradas(int cilindradas) {
        this.cilindradas =cilindradas;
    }
    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public void abastecer(int combustivel) {
        
        /* Adicionando o valor passado no atributo
         combustivelNoTanque ´veiculo ao combustivel ´moto */
        this.setCombustivelNoTanque(this.getCombustivelNoTanque() + combustivel);
        System.out.println("Abastecimento realizado." + this.getCombustivelNoTanque());
    }

    @Override
    public String toString() {

        /* retornando informações principais do veiculo */
        return "PLACA: " + this.getPlaca() + 
                "\nCOMBUSTIVEL NO TANQUE: " + this.getCombustivelNoTanque() +
                "\nQUILOMETRAGEM: " + this.getQuilometragem() + 
                "\nALUGADO: " + this.getAlugado() + 
                "\nPREÇO DA DIARIA: " + this.getPrecoDiaria();
    }

    @Override
    public boolean viajar(int distancia) {
        
        int distanciaPorLitro = 30;
        int combustivelNecessario = distancia / distanciaPorLitro;

        /* Verificando se o combustível no tanque é suficiente 
        para percorrer a distância passada como parâmetro*/
        if (getCombustivelNoTanque() >= combustivelNecessario) {

            setCombustivelNoTanque(getCombustivelNoTanque() - combustivelNecessario);
            setQuilometragem(getQuilometragem() + distancia);

            return true;
        } else {
            System.out.println("Não há combustível suficiente.");
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {

        // Comparando as placas dos veículos
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Veiculo veiculo = (Veiculo) obj;
        return getPlaca().equals(veiculo.getPlaca());
    }
}
