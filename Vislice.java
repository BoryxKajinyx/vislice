public class Vislice extends IgraZaDva implements IIgra{
    private String skritaBeseda;
    private StringBuffer tekočaBeseda;
    private StringBuffer prejšnjeČrke;
    private int številoČrkDoKonca;
    public Vislice() {
        skritaBeseda=Besede.nakljucnaBeseda();
        številoČrkDoKonca=skritaBeseda.length();
        tekočaBeseda=new StringBuffer();
        prejšnjeČrke=new StringBuffer();
        for(int i=0;i<skritaBeseda.length();i++){
            char ch= skritaBeseda.charAt(i);
            if(!Character.isWhitespace(ch))
            tekočaBeseda.append('_');
            else
            tekočaBeseda.append(' ');
        }
    }
    @Override
    public String getPromptIgre() {
        return "Vnesi črko:";
    }
    @Override
    public String reportIgre() {
        if(!konecIgre()){
            return tekočaBeseda.toString()+
                "\nPorabljene črke so: "+prejšnjeČrke.toString()+
                "\nNa vrsti je igralec "+getIgralec();
        }
        else if(prejšnjeČrke.length()>skritaBeseda.length()+12){
            return "Konec igre!"+
                "\nIzgubil si igro.";
        }
        else{
            return "Konec igre!"+
                "\nBeseda je:"+skritaBeseda+
                "\nZmagal je igralec "+dobiZmagovalca();
        }
    }
    @Override
    public void igraj(IUserInterface ui) {
        String s;
        if(rač1!=null){
            ui.report("Igralec 1 je "+rač1.toString());
        }
        if(rač2!=null){
            ui.report("Igralec 2 je "+rač2.toString());
        }
        while(!konecIgre()){
            IPlayer rač=null;
            ui.report(reportIgre());
            switch(getIgralec()){
                case (IGRALECENA):
                    rač=rač1;
                    break;
                case(IGRALECDVA):
                    rač=rač2;
                    break;
            }
            if(rač!=null){
                s=rač.narediPotezo(zahtevaIgre());
                ui.report(rač.toString()+" poskusi črko "+s);
                uganiČrko(s);
            }
            else{
                ui.prompt(getPromptIgre());
                String userInput=ui.getUserInput();
                uganiČrko(userInput);
            }
            
            if(!konecIgre())
            spremeniIgralca();
        }
        ui.report(reportIgre());
    }
    @Override
    public boolean konecIgre() {
        if(prejšnjeČrke.length()>skritaBeseda.length()+12)
        return true;
        else
        return številoČrkDoKonca<=0;
    }
    @Override
    public String dobiZmagovalca() {
        if(!konecIgre())
        return null;
        return Integer.toString(getIgralec());
    }
    public String zahtevaIgre(){
        return prejšnjeČrke.toString();
    }
    public String getSkritaBeseda(){
        return skritaBeseda;
    }
    public String getPrejšnjeČrke(){
        return prejšnjeČrke.toString();
    }
    public boolean uganiČrko(String s){
        if(s.length()==1){
            char ch=s.charAt(0);
            prejšnjeČrke.append(ch);
            boolean pravaCrka=false;
            for (int i = 0; i < skritaBeseda.length(); i++) {
                if(ch==skritaBeseda.charAt(i)){
                    tekočaBeseda.replace(i, i+1, ""+ch);
                    številoČrkDoKonca--;
                    pravaCrka=true;
                }
            }
            return pravaCrka;
        }else{
            if(s.equals(skritaBeseda)){
                številoČrkDoKonca=0;
                tekočaBeseda.delete(0, tekočaBeseda.length());
                tekočaBeseda.append(s);
                return true;
            }
            else{
                for(int i=0;i<s.length();i++){
                    prejšnjeČrke.append(s.charAt(i));
                }
                return false;
            }
        }
    }
}
