package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;

public class FiksniBroj extends TelefonskiBroj {

    public static  enum Grad {BIHAC, GORAZDE, LIVNO, MOSTAR, ORASJE, SARAJEVO, SIROKI_BRIJEG, TRAVNIK, TUZLA, ZENICA, BRCKO,
                                   MRKONJIC_GRAD, BANJA_LUKA, PRIJEDOR, DOBOJ, SAMAC, BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE};

    public static final Map<Grad,String> pozivniBrojevi =  new HashMap<Grad,String >(){
        {
            put(Grad.BIHAC, "037"); put(Grad.GORAZDE, "038"); put(Grad.LIVNO, "034");
            put(Grad.MOSTAR, "036"); put(Grad.ORASJE, "031"); put(Grad.SARAJEVO, "033"); put(Grad.SIROKI_BRIJEG,"039");
            put (Grad.TRAVNIK,"030"); put(Grad.TUZLA,"035"); put(Grad.ZENICA,"032");
            put (Grad.BRCKO,"049"); put (Grad.MRKONJIC_GRAD,"050"); put (Grad.BANJA_LUKA,"051"); put(Grad.PRIJEDOR,"052"); put(Grad.DOBOJ,"053");
            put (Grad.SAMAC,"054"); put (Grad.BIJELJINA,"055"); put(Grad.ZVORNIK,"056"); put (Grad.PALE,"057");
            put (Grad.FOCA,"058"); put (Grad.TREBINJE,"059");
        }
    };

    private Grad grad;
    private String broj;

    public int hashCode() { return  0; }

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

        /*Iterator it = pozivniBroj.entrySet().iterator();

        while(it.hasNext()) {

            Map.Entry pair = (Map.Entry) it.next();
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());

        }*/

        String pozivniBroj = pozivniBrojevi.get(this.grad);



        return pozivniBroj + "/" + broj;

    }



}
