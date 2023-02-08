public class ConstructorAssignment {
    public static void main(String[] args) {

        StockMarket accountobj1 = new StockMarket("Ravi", 101,6000);
        StockMarket accountobj2 = new StockMarket("Sonam", 102,9000);

        accountobj1.printStockmarketAcoount();
        accountobj2.printStockmarketAcoount();

        accountobj1.Loss(1000);
        accountobj1.Gain(400);
        accountobj2.Loss(7000);
        accountobj2.Gain(600);

        accountobj1.printStockmarketAcoount();
        accountobj1.printStockmarketAcoount();


    }
}

    class StockMarket
    {
        private String accountHolderName;
        private int accountNumber;
        private  float investedMoney;
        StockMarket (String accountHolderName, int accountNumber, float investedMoney )
        {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.investedMoney = investedMoney;
        }


          void printStockmarketAcoount ()
          {
              System.out.println("account holder name :"+accountHolderName);
              System.out.println("account Number :"+accountNumber);
              System.out.println("amount invested:"+investedMoney);
              System.out.println("_________________________");
          }


         void Loss(float amountLoss)
         {
             System.out.println("amount lost :"+amountLoss);
             investedMoney = investedMoney - amountLoss;
         }

          void Gain (float amountGain){
              System.out.println("amount gain:"+amountGain);
              investedMoney = investedMoney+amountGain;
          }

}

