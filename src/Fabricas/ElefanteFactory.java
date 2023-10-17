package Fabricas;

import Animais.Animal;
import Animais.Elefante;

public class ElefanteFactory extends  AnimalFactory {
    @Override
   public Animal criarAnimal() {
        return new Elefante();
    }
}
