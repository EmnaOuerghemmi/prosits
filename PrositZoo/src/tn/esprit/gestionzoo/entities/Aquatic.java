package tn.esprit.gestionzoo.entities;

 public class Aquatic extends Animal implements Carnivore<Food> {
     public String habitat;

     public Aquatic() {
     }

     public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
         super(family, name, age, isMammal);
         this.habitat = habitat;
     }

     public Aquatic(String habitat) {
         this.habitat=habitat;
     }

     public void setHabitat(String habitat) {
         this.habitat = habitat;
     }

     public String getHabitat() {
         return habitat;
     }
     public float getSwimmingDepth() {
         float swimmingDepth;
         return 0;
     }

     public void swim() {
         System.out.println("This aquatic animal is swimming.");
     };

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
     public boolean equals(Aquatic obj) {
         if (this== obj) {
             return true;
         }
         if (obj.getName() == this.getName() && obj.getAge() == this.getAge() && obj.habitat == this.habitat) {
             return true;

         }
         return false;


     }

     @Override
     public  void eatMeat(Food food) {
         if (food == Food.MEAT || food == Food.BOTH) {
             System.out.println("Aquatic is eating meat");
         } else {
             System.out.println("Aquatic does not eat meat");
         }
     }
 }
