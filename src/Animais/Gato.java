package Animais;

public class Gato extends Animal{
    public Gato(Gato gato) {
        this.setNumerosDePernas(gato.getNumerosDePernas());
    }

    public Gato() {
        this.setTipoAlimentacao(null);
        this.setTemPelo(null);
    }

    @Override
   public void comer() {
        System.out.println("corkcrokcrok");

    }

    @Override
   public void fazerSom() {
        System.out.println("miaumiaumiau");

    }

    @Override
   public void andar() {

        System.out.println("tstststststs");

    }

    @Override
    public String toString() {
        return "Gato{ " + super.toString();
    }

    @Override
    public Animal clonar() {
        return new Gato(this);
    }
}
