package Fabricas;

public class logisticaAnimal {


    public AnimalFactory create(String animal) {
        AnimalFactory fabrica;

        if (animal.equalsIgnoreCase("cachorro")) {
            fabrica = new CachorroFactory();
        } else if (animal.equalsIgnoreCase("Elefante")) {
            fabrica = new ElefanteFactory();
        } else if (animal.equalsIgnoreCase("gato")) {
            fabrica = new GatoFactory();
        } else {
            throw new IllegalArgumentException("Tipo de animal inválido.");
        }

        return fabrica;
    }


}
