public class ParameterQr{
    String codice = null;
    private String link = null;

    public ParaQr(){
        this("000000", null);
    }
    public ParaQr(String codice, String link){
        this.codice = codice;
        this.link = link;
    }

    public String getCodice(){
        return this.codice;
    }
    public void setCodice(String codice){
        this.codice = codice;
    }

    public String getLink(){
        return this.link;
    }
    public void setLink(String link){
        this.link = link;
    }
    
}