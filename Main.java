public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Shower shower = new Shower(-5,"Sandeep",20);

        try{
            shower.bathing(true);
        }
       catch (ShowerWaterTooHotException e){
           System.out.println("handler 1 :" +e);
       }
        catch (ShowerWaterTooColdException a){
            System.out.println("handler 2 : "+a);
        }
        
    }



}
 class Shower {
    int waterTemperature;
    String nameOfPerson;

    double soap;

     public Shower(int waterTemperature, String nameOfPerson, double soap) {
         this.waterTemperature = waterTemperature;
         this.nameOfPerson = nameOfPerson;
         this.soap = soap;
     }

     @Override
     public String toString() {
         return "Shower{" +
                 "waterTemperature=" + waterTemperature +
                 ", nameOfPerson='" + nameOfPerson + '\'' +
                 ", soap=" + soap +
                 '}';
     }

     void bathing (boolean takingShower){
         System.out.println("==> start taking shower");
         System.out.println("==> trying to take shower" );

         if (waterTemperature>80){
             ShowerWaterTooHotException a = new ShowerWaterTooHotException("if water will be too hot person can not take shower...");

             throw a;
         }

         else if (waterTemperature <0){
             ShowerWaterTooColdException c = new ShowerWaterTooColdException("if water will be too cold person can not take shower..");

             throw c;

         }
         System.out.println("==> finish taking taking shower");
     }
 }

 class ShowerWaterTooHotException extends RuntimeException
 {
     public ShowerWaterTooHotException(String message) {
         super(message);
     }
 }

 class ShowerWaterTooColdException extends RuntimeException{
     public ShowerWaterTooColdException(String message) {
         super(message);
     }
 }