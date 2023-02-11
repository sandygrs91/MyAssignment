public class InheritanceAssignment {
    public static void main(String[] args) {

        YoungKid boyObj = new YoungKid("Sandeep",17,55);
        boyObj.exercise();
        boyObj.running();
        System.out.println("________");

        BodyBuilder manObj = new BodyBuilder("sandeep", 22,65,3);
        manObj.bodyBuilding();
        System.out.println("________");

        MmaFighter fighterObj = new MmaFighter("Sandeep",25,70,3,70);

        fighterObj.running();
        fighterObj.training();

    }
}

         class YoungKid {
         String name;
         int age;
         int Weight ;

         public YoungKid( String name, int age, int weight) {
             this.name = name;
             this.age = age;
             Weight = weight;
             System.out.println("Young is a constructor" );
         }
             void exercise (){
             System.out.println(+age +" years old kid doing exercise");}


             void running()
             { System.out.println(name+"is runing everyday");}
         }


     class BodyBuilder extends YoungKid {
         int goingGymHourly;

         {
             System.out.println("Body Building is a constructor");
             System.out.println(name + "is going gym " + goingGymHourly + "hours a day");
         }

         public BodyBuilder(String name, int age, int weight, int goingGymHourly) {
             super(name, age, weight);
             this.goingGymHourly = goingGymHourly;
         }

         void bodyBuilding() {
             System.out.println(name + "now doing bodyBuilding everyday");
         }

         void dieting() {
             System.out.println(name + "is following diet properly ");
         }

     }
         class MmaFighter extends BodyBuilder

         {int fighting;

             public MmaFighter (String name, int age, int weight, int goingGymHourly, int fighting) {
                 super(name, age, weight, goingGymHourly);
                 this.fighting = fighting;
                 System.out.println("Mma champion is a constructor");

             }
             void training(){
                 System.out.println(name+"is training for MMA everyday");
             }

         }

