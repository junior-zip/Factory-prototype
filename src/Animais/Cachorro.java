package Animais;

import java.sql.SQLOutput;

public class Cachorro extends Animal {

    public Cachorro(Animal animal) {
        this.setNumerosDePernas(animal.getNumerosDePernas());
    }

    public Cachorro() {
        this.setTemPelo(null);
        this.setTipoAlimentacao(null);
    }

    @Override
    void comer() {
        System.out.println("NHANHAM");

    }

    @Override
    void fazerSom() {

        System.out.println("auauauau");

    }

    @Override
    void andar() {
        System.out.println("trtrtrtr");

    }

    @Override
    public String toString() {
        return "Cachorro{ " + super.toString();
    }

    @Override
   public Animal clonar() {
        return new Cachorro(this);
    }
}
