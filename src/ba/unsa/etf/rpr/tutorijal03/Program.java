package ba.unsa.etf.rpr.tutorijal03;

import java.util.Set;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public class Program {

    public static  void meni() {

        System.out.println("Dobrodosli na telefonsku centralu \"E - TeleFon\"");

        System.out.println("Molimo odaberite jednu od ponudenih opcija:");

        System.out.println("1. Dodavanje u imenik" +"\n" +
                           "2. Telefonski broj osobe u imeniku" + "\n" +
                           "3. Ime osobe u imeniku" + "\n" +
                           "4. Telefonski brojevi osoba cije ime pocinje odredenim slovom" + "\n" +
                           "5. Abecedno soritiran skup imena i prezimena osoba koje zive u nekom gradu" + "\n" +
                           "6. Skup brojeva za osobe iz odredenog grada" + "\n" +
                           "7. Kraj"
        );


    }

    public static void main (String[] args) {


       Imenik i = new Imenik();

       meni();




    }
}
