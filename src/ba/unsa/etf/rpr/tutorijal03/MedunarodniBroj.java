package ba.unsa.etf.rpr.tutorijal03;

// MedunarodniBroj​​ ima konstruktor ​MedunarodniBroj(String drzava, String broj)​​
// pri čemu string ​drzava​​ sadrži kompletan pozivni broj za državu npr. "+387".

public class MedunarodniBroj extends TelefonskiBroj {

    private String pozivniBrojDrzave;
    private String broj;

    public String getPozivniBrojDrzave() {

        return pozivniBrojDrzave;

    }

    public void setPozivniBrojDrzave(String pozivniBrojDrzave) {
        this.pozivniBrojDrzave = pozivniBrojDrzave;
    }

    public String getBroj() {

        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public int hashCode() { return  0; }

    public MedunarodniBroj(String drzava, String broj) {

        this.pozivniBrojDrzave = drzava;
        this.broj = broj;
    }

    public String ispisi() {

        return pozivniBrojDrzave + broj;
    }





}
