package tn.esprit.gestionzoo.entities;
public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }

    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println("Terrestrial is eating meat");
        } else {
            System.out.println("Terrestrial does not eat meat");
        }
    }
    @Override
    public void eatPlant(Food food) {
        if (food == Food.PLANT || food == Food.BOTH) {
            System.out.println("Terrestrial is eating plant");
        } else {
            System.out.println("Terrestrial does not eat plant");
        }
    }


    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("Terrestrial is eating plant and meat");
    }
}