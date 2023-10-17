package Fabricas;

import Animais.Animal;
import Animais.Gato;

public class GatoFactory extends AnimalFactory{
    @Override
    public Animal criarAnimal() {
        return new Gato();
    }
}
