package Animais;

public abstract class Animal {
    private  int numerosDePernas;
    private String tipoAlimentacao;
    private Boolean temPelo;


    abstract void comer();
    abstract void fazerSom();
    abstract void andar();

    public abstract Animal clonar();

    public int getNumerosDePernas() {
        return numerosDePernas;
    }

    public void setNumerosDePernas(int numerosDePernas) {
        this.numerosDePernas = numerosDePernas;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public boolean isTemPelo() {
        return temPelo;
    }

    public void setTemPelo(Boolean temPelo) {
        this.temPelo = temPelo;
    }


    @Override
    public String toString() {
        return "numerosDePernas=" + numerosDePernas +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                ", temPelo=" + temPelo +
                '}';
    }
}
