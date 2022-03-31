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
        "OKNO",
        "OTORINOLARINOLOG",
        "TELEFON",
        "BESEDA",
        "GOSTILNA",
        "ZVEZDA",
        "PIZZERIJA",
        "STOL",
        "STAVEK",
        "JAVA",
        "IGRA",
        "FIZIKA",
        "TORBA",
        "ZAVESA",
        "TABLA",
        "PLASTENKA",
        "DREVO",
        "SVETILO",
        "KLIMATSKA NAPRAVA",
        "PRAZNO",
        "OBRIS",
        "SOCIOLOGIJA"
    };
    public static String nakljucnaBeseda(){
        int beseda=(int)(Math.random()*besede.length);
        return besede[beseda];
    }
}
