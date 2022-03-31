import java.util.Scanner;

public class TekstovniUmesnik implements IUserInterface{
    Scanner sc = new Scanner(System.in);
    @Override
    public String getUserInput() {
        return sc.nextLine();
    }

    @Override
    public void report(String s) {
        System.out.println(s);
    }

    @Override
    public void prompt(String s) {
        System.out.println(s);
    }
    public void konec(){
        sc.close();
    }
}
