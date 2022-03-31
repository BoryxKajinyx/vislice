public class Main {
    public static void main(String[] args) {
        Vislice v=new Vislice();
        TekstovniUmesnik ui=new TekstovniUmesnik();
        v.dodajRačIgralca(new DelnoNakljucniIgralec());
        v.dodajRačIgralca(new DelnoNakljucniIgralec());
        v.igraj(ui);
    }
}
