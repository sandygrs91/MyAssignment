public class thirdDay {
    public static void main(String[] args) {
        Laundry laundry = new Laundry();
        laundry.cleaning1();
        laundry.cleaning2(10);
        laundry.cleaning3(20,30);
        int cloths=laundry.cleaning4();
        System.out.println("laundry man cleaning");

    }
}
    class Laundry
    {void cleaning1(){
        System.out.println("in Laundry you clean your cloths");
    }

        void cleaning2(int washing){
            System.out.println("in laundry people"+washing+"their cloths");
        }
        void cleaning3(int washing , int drying){
            System.out.println("in laundry people "+washing+"and"+drying+"their cloths");
        }
        int cleaning4(){
            System.out.println("laundry man clean for you");
            return 10;


        }
}
