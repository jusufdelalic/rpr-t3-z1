package ba.unsa.etf.rpr.tutorijal03;


import java.util.*;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;
import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.pozivniBrojevi;


public class Imenik {

    private HashMap<String, TelefonskiBroj> imenik;

    public Imenik() {
        imenik = new HashMap<String, TelefonskiBroj>();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {

        imenik.put(ime, broj);

    }

    //vraća sve brojeve u telefonskom imeniku za osobe čije
    // ime počinje na slovo ​s​​ u formatu: 1. Ime Prezime - broj 2. Ime Prezime - broj


    public String naSlovo(char s) {

        Iterator it = imenik.entrySet().iterator();

        String osobeNaSlovo = new String();

        while (it.hasNext()) {

            HashMap.Entry pair = (HashMap.Entry) it.next();
            if (((String) (pair.getKey())).charAt(0) == s)
                osobeNaSlovo += (String) (pair.getKey() + " - " + ((TelefonskiBroj) (pair.getValue())).ispisi() + "\n"); // u mapi se cuvaju reference na Object

        }

        return osobeNaSlovo;

    }

    public String dajBroj(String ime) {

        if (imenik.containsKey(ime)) return imenik.get(ime).ispisi(); // cast TelefonskiBroj u String
        else throw new NoSuchElementException();
    }

    public String dajIme(TelefonskiBroj broj) {

        if (!imenik.containsValue(broj)) throw new NoSuchElementException();


        Iterator it = imenik.entrySet().iterator();

        while (it.hasNext()) {

            HashMap.Entry pair = (HashMap.Entry) it.next();
            if (pair.getValue() == broj) return (String) pair.getKey(); // u mapi se cuvaju reference na Object


        }

        return new String();


    }



    Set<String> izGrada(Grad g) {


        Iterator it = imenik.entrySet().iterator();

        HashSet<String> ljudiIzGrada = new HashSet<String>();

        while (it.hasNext()) {

            Map.Entry pair = (Map.Entry) it.next();
            if (pair.getValue() instanceof FiksniBroj && ((FiksniBroj) pair.getValue()).getGrad() == g)
                ljudiIzGrada.add((String) pair.getKey());

        }

        return ljudiIzGrada;
    }





}
