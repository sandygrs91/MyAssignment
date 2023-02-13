public class InharitanceTest {
    public static void main(String[] args) {

        Galaxy galaxy = new Galaxy();
        galaxy.dark.fear();
        galaxy.gravity.stick();
        galaxy.stars();
        galaxy.light();
        System.out.println("__________");

        Planets planets= new Planets();
        planets.gravity.stick();
        planets.neutron.electricity();
        planets.light();
        planets.life();
        System.out.println("_______________");

        Creatures creatures = new Creatures();
        creatures.life();
        creatures.live();
        creatures.breath();
        System.out.println("_________");

        Building building = new Building();

        building.solid();
        building.tall();
        building.walls.separation();
        System.out.println("__________");

        Apartment apartment = new Apartment();
        apartment.walls.separation();
        apartment.solid();
        apartment.tall();
        System.out.println("_________");

        Ocean ocean = new Ocean();
        ocean.dark.fear();
        ocean.deep();
        ocean.neutron.electricity();
        System.out.println("_____");

        Fish fish = new Fish();
        fish.swim();
        fish.underWaterBreathing();
        System.out.println("__________");




    }
}


     class Universe {

        Gravity gravity = new Gravity();
        Darkness dark = new Darkness();
        Neutron neutron = new Neutron();
        void light() {
            System.out.println("Universe has light______");
        }
}
     class Galaxy extends Universe
     {
         void stars()
         {
             System.out.println("galaxy has millions of stars");
         }
     }
     class Planets extends Universe
     {
         void life() {
             System.out.println("mother earth contain life.");
         }

     }
     class Creatures extends Planets {
         void live() {
             System.out.println("all creatures live in earth ");
         }
         void breath(){
             System.out.println("all creature in earth breath Oxygen");
         }
     }
     class NonLivingThings extends Planets
     {void solid()
             {
         System.out.println("non living things can be solid ");
     }
     }
     class Building extends NonLivingThings
     {void tall (){
         System.out.println("building are tall mostly in cities");}
         Walls walls = new Walls();}

         class Apartment extends Building
     {
      void livingSpace(){
          System.out.println("people live in apartments");
      } }

     class Walls
     { void separation (){
        System.out.println("walls always separates space in areas");
    }
     }
     class Animals extends Creatures
     {void Breed(){
         System.out.println("all animals breed and increase their numbers");}
     }

     class Ocean extends Planets
     {void deep() {
         System.out.println("pacific ocean is one of the deepest ocean ");
     }
     }

     class  SeaCreatures {
    void swim(){
        System.out.println("all sea creature knows how to swim");
    }
     }

     class Fish extends SeaCreatures
     {void underWaterBreathing(){
         System.out.println("all fish has gills to breath");
     }}



     class Gravity

     { void stick()
         { System.out.println("because of Gravity everything stick on surface ");}
     }
     class Darkness
     { void fear()
         {
             System.out.println("in darkness we feel feel fear");
         }
     }

    class Neutron
    {void electricity()
    {
        System.out.println("neutron is an uncharged elements contain electricity ");}
    }

