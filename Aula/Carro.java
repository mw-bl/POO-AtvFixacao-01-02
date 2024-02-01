public class Carro extends Veiculo {
    private double potenciaDoMotor;

    public void setCilindradas(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }
    public double getCilindradas() {
        return potenciaDoMotor;
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
        
        int distanciaPorLitro = 10;
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