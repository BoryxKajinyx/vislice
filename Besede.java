public class Besede {
    private Besede() {}
    private static String[] besede={
        "MATEMATIKA",
        "ASTRONOMIJA",
        "KORONAVIRUS",
        "LOCKDOWN",
        "EPIDEMIJA",
        "UKRAJINA",
        "REVMATIZEM",
        "VISLICE",
        "TIPKOVNICA",
        "BESEDA",
        "OGLEDALO",
        "EASISTENT",
        "OKNO"
    };
    public static String nakljucnaBeseda(){
        int beseda=(int)(Math.random()*besede.length);
        return besede[beseda];
    }
}
