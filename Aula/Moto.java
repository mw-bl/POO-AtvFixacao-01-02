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
        this.setCombustivelNoTanque(this.getCombustivelNoTanque() + combustivel);
        System.out.println("Abastecimento realizado." + this.getCombustivelNoTanque());
    }

    @Override
    public String toString() {
        return "PLACA: " + this.getPlaca() + 
                "\nCOMBUSTIVEL NO TANQUE: " + this.getCombustivelNoTanque() +
                "\nQUILOMETRAGEM: " + this.getPlaca() + 
                "\nALUGADO: " + this.getAlugado() + 
                "\nPREÇO DA DIARIA: " + this.getPrecoDiaria();
    }

    @Override
    public boolean viajar(int distancia) {
        
        int distanciaPorLitro = 30;
        int combustivelNecessario = distancia / distanciaPorLitro;

        if (getCombustivelNoTanque() >= combustivelNecessario) {

            setCombustivelNoTanque(getCombustivelNoTanque() - combustivelNecessario);
            setQuilometragem(getQuilometragem() + distancia);

            return true;
        } else {
            System.out.println("Não há combustível suficiente.");
            return false;
        }
    }
}