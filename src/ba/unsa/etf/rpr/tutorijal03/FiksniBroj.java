package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FiksniBroj {

    public static enum Grad {BIHAC, GORAZDE, LIVNO, MOSTAR, ORASJE, SARAJEVO, SIROKI_BRIJEG, TRAVNIK, TUZLA, ZENICA, BRCKO,
                                   MRKONJIC_GRAD,BANJA_LUKA,PRIJEDOR, DOBOJ, SAMAC, BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE};

    public static final Map<Grad,String> pozivniBrojevi =  new HashMap<Grad,String >(){
        {
            put(Grad.BIHAC, "037"); put(Grad.GORAZDE, "038"); put(Grad.LIVNO, "034");
                    put(Grad.MOSTAR, "036"); put(Grad.ORASJE, "031"); put(Grad.SARAJEVO, "033");/*,{Grad.SIROKI_BRIJEG,"039"},{Grad.TRAVNIK,"030"},{Grad.TUZLA,"035"},{Grad.ZENICA,"032"},
        {Grad.BRCKO,"049"}, {Grad.MRKONJIC_GRAD,"050"},{Grad.BANJA_LUKA,"051"},{Grad.PRIJEDOR,"052"},{Grad.DOBOJ,"053"},{Grad.SAMAC,"054"},
        {Grad.BIJELJINA,"055"},{Grad.ZVORNIK,"056"},{Grad.PALE,"057"},{Grad.FOCA,"058"},{Grad.TREBINJE,"059"}*/
        }
    };

    private Grad grad;
    private String broj;

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

    public void ispisi() {

        /*Iterator it = pozivniBroj.entrySet().iterator();

        while(it.hasNext()) {

            Map.Entry pair = (Map.Entry) it.next();
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());

        }*/

        String pozivniBroj = pozivniBrojevi.get(this.grad);

        System.out.println(pozivniBroj + "/" + broj);

    }


}
