public class InterfaceTest {
    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.helpingHuman();
        machine.solvingIssue();


        System.out.println("____________");

        AtmMachine atmMachine = new AtmMachine();

        atmMachine.getCash();
        atmMachine.showBalance();
        atmMachine.helpingHuman();
        atmMachine.solvingIssue();


        System.out.println("___________");

        Mobile mobile = new Mobile();
        mobile.calling();
        mobile.storePhotos();
        mobile.helpingHuman();
        mobile.solvingIssue();
    }
}

interface HelpingHuman{
    void helpingHuman();
}
interface SolvingIssue {
    void solvingIssue();
}
interface GetCash{
    void getCash();
}
interface DepositMoney{
    void depositCash();
}
interface ShowBalance{
    void showBalance();
}
interface Calling{
    void calling();
}
interface StorePhotos{
    void storePhotos();
}


class Machine implements HelpingHuman,SolvingIssue{

    @Override
    public void helpingHuman() {
        System.out.println("machine is build for help humans");

    }

    @Override
    public void solvingIssue() {
        System.out.println("machines can solve problem ");

    }
}
class AtmMachine extends Machine implements HelpingHuman,SolvingIssue {

    public void getCash() {
        System.out.println("ATM machine can give you cash");
    }

    public void showBalance() {
        System.out.println("ATM machine can show you Your Account Balance");
    }
}
class Mobile extends Machine implements SolvingIssue,HelpingHuman {

    public void calling(){
        System.out.println("Mobile basic function is calling");
    }
    public void storePhotos(){
        System.out.println("Mobile can store your video and picture inside memories");
    }
}

