public class NakljucniIgralec implements IPlayer{
    public String narediPotezo(String zahteva){
        char ch=(char)('A'+Math.round(Math.random()*('Z'-'A')));
        return ""+ch;
    }
}
