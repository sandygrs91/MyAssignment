public class CompoundInterest {
    public static void main(String[] args) {

        Interst interst01 = new Interst();
        interst01.CalculateCompoundIn();
    }
}

     class Interst
     { int Principlevalue = 30000;
     int RateOfInt = 4;
     float year = 7;


    float CompoundInt = (Principlevalue * (1+RateOfInt/100)*year);
    void CalculateCompoundIn()
         {
         System.out.println("compound year ="+CompoundInt);
        }

     }


