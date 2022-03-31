public class DelnoNakljucniIgralec implements IPlayer{
    @Override
    public String narediPotezo(String zahteva){
        char ch=(char)('A'+Math.round(Math.random()*('Z'-'A')));
        while(!preveri(ch, zahteva)){
            ch=(char)('A'+Math.round(Math.random()*('Z'-'A')));
        }
        return ""+ch;
    }
    public boolean preveri(char ch,String zahteva){
        for(int i=0;i<zahteva.length();i++){
            if(ch==zahteva.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
