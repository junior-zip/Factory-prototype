package Fabricas;

import Animais.Animal;
import Animais.Cachorro;

public class CachorroFactory extends  AnimalFactory{

private Animal animal;
    @Override
   public Animal criarAnimal() {
        return new Cachorro();
    }
}
