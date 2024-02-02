public abstract class Veiculo {
    private String placa;
    private int CombustivelNoTanque;
    private int quilometragem;
    private boolean alugado;
    private double precoDiaria;
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }

    public void setCombustivelNoTanque(int CombustivelNoTanque) {
        this.CombustivelNoTanque = CombustivelNoTanque;
    }
    public int getCombustivelNoTanque() {
        return CombustivelNoTanque;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    public int getQuilometragem() {
        return quilometragem;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    public boolean getAlugado() {
        return alugado;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }
    public double getPrecoDiaria() {
        return precoDiaria;
    }

    // done.
    public abstract void abastecer(int combustivel);

    // done.
    public abstract boolean viajar(int distancia);

    // done.
    public abstract String toString();

    // done.
    public abstract boolean equals(Object obj);

} 
