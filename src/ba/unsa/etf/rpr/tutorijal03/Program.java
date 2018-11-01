package ba.unsa.etf.rpr.tutorijal03;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.*;

public class Program {

    public static void main (String[] args) {

        Imenik imenik = new Imenik();

        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Pero Peric", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Ivo Ivic", new MobilniBroj(61, "321-645"));
        imenik.dodaj("Jozo Jozic", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        System.out.println(imenik.naSlovo('J').trim());

    }
}
