import Animais.Animal;
import Animais.Cachorro;
import Animais.Elefante;
import Animais.Gato;
import Fabricas.*;

public class Main {
    public static void main(String[] args) {


        logisticaAnimal logistica = new logisticaAnimal();

       AnimalFactory cachorroFactory = logistica.create("cachorro");
        AnimalFactory elefanteFactory = logistica.create("elefante");
        AnimalFactory gatoFactory = logistica.create("gato");

        Cachorro pitbull = (Cachorro) cachorroFactory.criarAnimal();
        pitbull.setNumerosDePernas(4);
        pitbull.setTemPelo(false);
        pitbull.setTipoAlimentacao("ração dog show");

        Cachorro miniPitibull = (Cachorro) pitbull.clonar();
        miniPitibull.setTipoAlimentacao("raçao vegana");
        miniPitibull.setTemPelo(false);
        System.out.println(pitbull);
        System.out.println(miniPitibull);

        // -------------

        Elefante elefanteCinza = (Elefante) elefanteFactory.criarAnimal();
        elefanteCinza.setNumerosDePernas(4);
        elefanteCinza.setTemPelo(false);
        elefanteCinza.setTipoAlimentacao("Plantas baixas");

        Elefante elefanteRosa = (Elefante) elefanteCinza.clonar();
        elefanteRosa.setTipoAlimentacao("plantas altas");
        elefanteRosa.setTemPelo(true);
        System.out.println(elefanteCinza);
        System.out.println(elefanteRosa);

        //------------------

        Gato gatoLaranja = (Gato) gatoFactory.criarAnimal();
        gatoLaranja.setNumerosDePernas(4);
        gatoLaranja.setTemPelo(true);
        gatoLaranja.setTipoAlimentacao("racao salmao");

        Gato gatoPelado = (Gato) gatoLaranja.clonar();
        gatoPelado.setTipoAlimentacao("racao carne");
        gatoPelado.setTemPelo(false);
        System.out.println(gatoLaranja);
        System.out.println(gatoPelado);





    }
}