package Animais;

public class Elefante extends Animal{
    public Elefante(Elefante elefante) {
        this.setNumerosDePernas(elefante.getNumerosDePernas());
    }
    public Elefante() {
        this.setTemPelo(null);
        this.setTipoAlimentacao(null);
    }

    @Override
    public  void comer() {
        System.out.println("coufcoufcouf");

    }

    @Override
   public void fazerSom() {

        System.out.println("pruuuu");

    }

    @Override
  public void andar() {
        System.out.println("poupoupou");

    }

    @Override
    public String toString() {
        return "Elefante{ " + super.toString();
    }

    @Override
  public Animal clonar() {
        return new Elefante(this);
    }
}
