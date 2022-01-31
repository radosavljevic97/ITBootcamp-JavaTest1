package JavaTest1;

//NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar
//Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
//1 evro je 0,0085 dinara
//1 franak je 0,0093 dinara
//1 dolar je 0,010 dinara
//Ispise vrsiti iskljucivo iz main metode!

import java.util.Scanner;

public class Zadatak4 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Molimo Vas unesite iznos u dinarima: ");
        int iznos = s.nextInt();

        System.out.print("Molimo Vas unesite valutu u koju da konvertujemo dinare: ");
        String valuta = s.next();

        System.out.println(konvertovanje(iznos, valuta));


    }

    public static double konvertovanje(int iznosDinara, String valuta) {
        double konverzija;
        if (valuta == "evro") {
            konverzija = iznosDinara * 0.0085;
        } else if (valuta == "franak") {
            konverzija = iznosDinara * 0.0093;
        } else if (valuta == "dolar") {
            konverzija = iznosDinara * 0.010;
        }
        else{
            System.out.println("Niste uneli dobru valutu");
            konverzija = -1;
        }
        return konverzija;
    }
}
