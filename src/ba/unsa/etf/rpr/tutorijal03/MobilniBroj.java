package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;
    private String broj;

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    public String getBroj() {

        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public int hashCode() { return ispisi().hashCode(); }

    public MobilniBroj (int mobilnaMreza, String broj) {

        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;

    }

    public String ispisi() {

         return "0" + mobilnaMreza + "/" + broj;

    }



}
