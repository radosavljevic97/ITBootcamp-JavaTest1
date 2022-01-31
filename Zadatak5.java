package JavaTest1;

//NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
//Proizvoljno napravite niz od 10 brojeva
//korisnik unosi broj koji zeli da prebroji u nizu
//niz je tipa int

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        int[] niz = {5, 7, 3, 20, 3, 5, 5, 10, 9, 3};

        System.out.println("Unesite broj koji zelite da prebrojite u nizu brojeva: ");
        System.out.println(vraceniNiz(niz));

    }

    public static int vraceniNiz(int[] niz){
        Scanner s = new Scanner(System.in);
        int trazeniBroj = s.nextInt();
        int istiBrojevi = 0;
        for(int i = 0; i < niz.length; i++){
            if(niz[i] == trazeniBroj){
                istiBrojevi = istiBrojevi + 1;
            }
        }
        return istiBrojevi;
    }
}
