package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;

public class FiksniBroj extends TelefonskiBroj {

    public static enum Grad {
        BANJA_LUKA, BIHAC, BIJELJINA, BRCKO, DOBOJ, FOCA, GORAZDE, LIVNO, MOSTAR, MRKONJIC_GRAD, ORASJE,
        PALE, PRIJEDOR, SAMAC, SARAJEVO, SIROKI_BRIJEG, TRAVNIK, TREBINJE, TUZLA, ZENICA, ZVORNIK
    };

    // HashMap of area codes
    public static final Map<Grad,String> pozivniBrojevi =  new HashMap<Grad,String >(){
        {
            put(Grad.BIHAC, "037"); put(Grad.GORAZDE, "038"); put(Grad.LIVNO, "034");
            put(Grad.MOSTAR, "036"); put(Grad.ORASJE, "031"); put(Grad.SARAJEVO, "033");
            put(Grad.SIROKI_BRIJEG,"039"); put (Grad.TRAVNIK,"030"); put(Grad.TUZLA,"035"); put(Grad.ZENICA,"032");
            put (Grad.BRCKO,"049"); put (Grad.MRKONJIC_GRAD,"050"); put (Grad.BANJA_LUKA,"051");
            put(Grad.PRIJEDOR,"052"); put(Grad.DOBOJ,"053"); put (Grad.SAMAC,"054"); put (Grad.BIJELJINA,"055");
            put(Grad.ZVORNIK,"056"); put (Grad.PALE,"057"); put (Grad.FOCA,"058"); put (Grad.TREBINJE,"059");
        }
    };

    private Grad grad;
    private String broj;

    public int hashCode() { return  ispisi().hashCode(); }

    public FiksniBroj (Grad grad, String broj) {

        this.grad = grad;
        this.broj = broj;

    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getBroj() {
        return broj;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public Grad getGrad() {
        return grad;
    }

    public String ispisi() {

        String pozivniBroj = pozivniBrojevi.get(this.grad);

        return pozivniBroj + "/" + broj;

    }



}
