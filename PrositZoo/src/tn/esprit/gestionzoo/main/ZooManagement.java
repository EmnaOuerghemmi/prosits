package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("-------------------------------------------------------");
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);



        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);

        dolphin.swim();


        //prosit6
        myZoo.addAquaticAnimal(aquatic);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.swimAllAquaticAnimals();
        //prosit8;
        Aquatic manneni =new Aquatic("String family", "String name", 1, true, "String habitat");
        System.out.println("Testing Aquatic:");
       manneni.eatMeat(Food.MEAT);


        System.out.println("\nTesting Penguin:");
        //Penguin.eatMeat(Food.PLANT);

        Terrestrial terr = new Terrestrial();
        System.out.println("\nTesting Terrestrial:");
        terr.eatMeat(Food.BOTH);  // Teste la méthode eatMeat de Terrestrial
        terr.eatPlant(Food.PLANT);  // Teste la méthode eatPlant de Terrestrial
        terr.eatPlantAndMeet(Food.BOTH);  // Teste la méthode eat
    }
}
