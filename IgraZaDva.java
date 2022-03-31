public abstract class IgraZaDva {
    public static final int IGRALECENA=1;
    public static final int IGRALECDVA=2;
    protected boolean prviNaslednji=true;
    protected int nRač=0;
    protected IPlayer rač1,rač2;

    public void setIgralec(int začne){
        if(začne==IGRALECDVA)
            prviNaslednji=false;
        else
            prviNaslednji=true;
    }
    public int getIgralec(){
        if (prviNaslednji)
            return IGRALECENA;
        return IGRALECDVA;
    }
    public void spremeniIgralca(){
        prviNaslednji=!prviNaslednji;
    }
    public int getNRač(){
        return nRač;
    }
    public void dodajRačIgralca(IPlayer i){
        if(nRač==0){
            rač2=i;
        }
        else {
            if(nRač==1){
                rač1=i;
            }
            else
                return;
        }
        nRač++;
    }
    public String getPravila(){
        return "Pravila igre so: \n";
    }
    public abstract boolean konecIgre();
    public abstract String dobiZmagovalca();
}
