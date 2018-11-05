package ba.unsa.etf.rpr.tutorijal03;

import java.util.Iterator;
import java.util.Scanner;
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
                           "5. Abecedno sortiran skup imena i prezimena osoba koje zive u nekom gradu" + "\n" +
                           "6. Skup brojeva za osobe iz odredenog grada" + "\n" +
                           "7. Kraj"
        );


    }

    public static void izborBroja() {

        System.out.println("Molimo odaberite jedan od ponudenih vrsta telefonskih brojeva:");
        System.out.println("1) Fiksni broj" + "\n" + "2) Medunarodni broj" + "\n" + "3) Mobilni broj");

    }

    public static void izborGrada() {



        System.out.println("Molimo unesite naziv jednog od sljedećih gradova velikim štampanim slovima." + "\n" + "U slučaju da se " +
                "ime grada sastoji od više riječi koristite \"_\" kao znak razdvajanja:");
        System.out.println("1) Banja Luka1" + "\n" + "2) Bihac" + "\n" + "3) Bijeljina" + "\n" + "4) Brcko" + "\n" + "5) Doboj" + "\n" +
                "6) Foca" + "\n" + "7) Gorazde" + "\n" + "8) Livno" + "\n" + "9) Mostar" + "\n" + "10) Mrkonjic Grad" + "\n" +
                "11) Orasje" + "\n" +"12) Pale" + "\n" +"13) Prijedor" + "\n" +"14) Samac" + "\n" +"15) Sarajevo" + "\n" +
                "16) Siroki Brijeg" + "\n" +"17) Travnik" + "\n" +"18) Trebinje" + "\n" +"19) Tuzla" + "\n" +"20) Zenica" + "\n" +
                "21) Zvornik");


    }



    public static void main (String[] args) {


       Imenik i = new Imenik();

       meni();

       int izbor;

       Scanner ulazniTok = new Scanner(System.in);

       izbor = ulazniTok.nextInt();
       ulazniTok.nextLine(); // because of \n left in the input stream...

        while(izbor != 7) {
       switch(izbor) {

           case 1:
               System.out.print("Unesite ime  i prezime osobe: ");
               String ime;
               ime = ulazniTok.nextLine();

               izborBroja();
               int izabraniBroj = ulazniTok.nextInt();
               ulazniTok.nextLine();

               if (izabraniBroj == 1) {


                   izborGrada();

                   String izabraniGrad = ulazniTok.nextLine();

                   FiksniBroj.Grad grad = FiksniBroj.Grad.valueOf(izabraniGrad);

                   System.out.print("Unesite broj:");

                   String uneseniBroj = ulazniTok.nextLine();

                   i.dodaj(ime, new FiksniBroj(grad, uneseniBroj));


               } else if (izabraniBroj == 2) {

                   System.out.print("Unesite pozivni broj drzave: ");
                   String drzava = ulazniTok.nextLine();
                   System.out.print("Unesite broj: ");
                   String uneseniBroj = ulazniTok.nextLine();

                   i.dodaj(ime, new MedunarodniBroj(drzava, uneseniBroj));


               } else {
                   System.out.print("Unesite mobilnu mrezu:");
                   int mobilnaMreza = ulazniTok.nextInt();
                   System.out.print("Unesite broj: ");
                   String uneseniBroj = ulazniTok.nextLine();

                   i.dodaj(ime, new MobilniBroj(mobilnaMreza, uneseniBroj));
               }

               break;

           case 2:

               System.out.println("Unesite naziv osobe:");
               ime = ulazniTok.nextLine();

               System.out.println("Osoba" + ime + "ima telefonski broj" + i.dajBroj(ime));

               break;

           case 3:

               System.out.println("Unesite broj");
               String broj = ulazniTok.nextLine();

               TelefonskiBroj telefonskiBroj;

               izborBroja();
               izabraniBroj = ulazniTok.nextInt();
               ulazniTok.nextLine();

               if (izabraniBroj == 1) {


                   izborGrada();

                   String izabraniGrad = ulazniTok.nextLine();

                   FiksniBroj.Grad grad = FiksniBroj.Grad.valueOf(izabraniGrad);

                   System.out.print("Unesite broj:");

                   String uneseniBroj = ulazniTok.nextLine();

                   telefonskiBroj = new FiksniBroj(grad, uneseniBroj);


               } else if (izabraniBroj == 2) {

                   System.out.print("Unesite pozivni broj drzave: ");
                   String drzava = ulazniTok.nextLine();
                   System.out.print("Unesite broj: ");
                   String uneseniBroj = ulazniTok.nextLine();

                   telefonskiBroj = new MedunarodniBroj(drzava, uneseniBroj);


               } else {
                   System.out.print("Unesite mobilnu mrezu:");
                   int mobilnaMreza = ulazniTok.nextInt();
                   System.out.print("Unesite broj: ");
                   String uneseniBroj = ulazniTok.nextLine();

                   telefonskiBroj = new MobilniBroj(mobilnaMreza, uneseniBroj);

               }


               System.out.println("Osoba " + i.dajIme(telefonskiBroj) + "ima broj " + broj);

               break;

           case 4:

               System.out.println("Unesite slovo:");
               char slovo = ulazniTok.next(".").charAt(0);

               System.out.println("Osobe cije ime pocinje sa " + "\""+ slovo + "\": "+ i.naSlovo(slovo).trim()); // metod trim() removes whitespaces at
               break;                                                                                // the beginning and end of a string

           case 5:

               izborGrada();
               String izabraniGrad = ulazniTok.nextLine();
               FiksniBroj.Grad grad = FiksniBroj.Grad.valueOf(izabraniGrad);


               Set<String> imena = i.izGrada(grad);

               System.out.println("Imena osoba iz grada " + izabraniGrad + ":");

               Iterator it = imena.iterator();

               while (it.hasNext()) {

                   System.out.println(it.next()); // something like it++

               }

               break;

           case 6:

               izborGrada();
               izabraniGrad = ulazniTok.nextLine();
               grad = FiksniBroj.Grad.valueOf(izabraniGrad);

               Set<TelefonskiBroj> telefonskiBrojevi = i.izGradaBrojevi(grad);

               System.out.println("Telefonski brojevi osoba iz grada " + izabraniGrad + ":");

               it = telefonskiBrojevi.iterator();

               while (it.hasNext()) {

                   System.out.println(((FiksniBroj) it.next()).ispisi()); // something like it++

               }

               break;


           case 7:
               break;


       }

       meni ();
            izbor = ulazniTok.nextInt();
            ulazniTok.nextLine(); // because of \n left in the input stream...

       }




    }
}
