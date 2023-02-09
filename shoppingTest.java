public class shoppingTest {
    public static void main(String[] args) {

        Shopping shopping = new Shopping();

        shopping.cloths();
        shopping.cloths(2);
        shopping.cloths(4,50L);
        shopping.cloths(100L,5);
    }
}

   class Shopping
     {
                    void cloths()

                     {System.out.println("she bought nothing.......");}


                     void cloths (int shorts)

                 {
                     System.out.println("she bought " + shorts+  "shorts");}

                     void cloths ( int jacket, long shocks)
                     {
                         System.out.println("she have got lots of shocks  :"+shocks +" and one Jacket :"+jacket  );
                     }
                     void cloths ( long shirts, int jeans)
                     {
                         System.out.println("she have bought so many shirts : "+shirts +" and two jeans :" + jeans);
                     }


                 }