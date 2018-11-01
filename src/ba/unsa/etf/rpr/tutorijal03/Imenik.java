package ba.unsa.etf.rpr.tutorijal03;


import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
//import java.util.Map;

/*
 Set<String> izGrada(Grad g)​​ - vraća skup Stringova koji sadrži imena i prezimena svih osoba koje žive u gradu ​g​​ (istog pobrojanog tipa koji je dat u klasi FiksniBroj), što se može saznati ako osoba ima fiksni broj telefona u tom gradu. Pri tome skup treba biti sortiran abecedno.
 */
public class Imenik {

    private HashMap<String, TelefonskiBroj> imenik;

    public Imenik() { imenik = new HashMap<String,TelefonskiBroj>(); }

    public void dodaj(String ime, TelefonskiBroj broj) {

        imenik.put(ime,broj);

    }

    //vraća sve brojeve u telefonskom imeniku za osobe čije
    // ime počinje na slovo ​s​​ u formatu: 1. Ime Prezime - broj 2. Ime Prezime - broj




    public String naSlovo (char s) {

        Iterator it = imenik.entrySet().iterator();

        String osobeNaSlovo = new String();

        while (it.hasNext()) {

            HashMap.Entry pair = (HashMap.Entry) it.next();
            if ( ((String) (pair.getKey())).charAt(0)== s) osobeNaSlovo += (String) (pair.getKey() + " - " + ((TelefonskiBroj) (pair.getValue())).ispisi() + "\n"); // u mapi se cuvaju reference na Object

        }

     return osobeNaSlovo;

    }

    public String dajBroj(String ime) {

        if ( imenik.containsKey(ime) ) return imenik.get(ime).ispisi(); // cast TelefonskiBroj u String
        else throw new NoSuchElementException();
    }

    public String dajIme (TelefonskiBroj broj) {

        if(!imenik.containsValue(broj)) throw new NoSuchElementException();


            Iterator it = imenik.entrySet().iterator();

        while(it.hasNext()) {

            HashMap.Entry pair = (HashMap.Entry) it.next();
            if(pair.getValue() == broj) return  (String) pair.getKey(); // u mapi se cuvaju reference na Object


        }

        return new String();


    }




}
