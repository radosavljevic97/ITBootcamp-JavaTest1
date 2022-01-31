package JavaTest1;

//Napisati program koji racuna potrosnju goriva
//Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
//Motor trosi 5 litara goriva na 100 kilometara,
//Automobil trosi 7 litara na 100 kilometara,
//Kombi trosi 11 litara na 100km,
//Kamion trosi 15 litara na 100km
//Nakon sto korisnik unese tip vozila treba pokrenuti ostatak programa kroz switch

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite distancu koju zelite da predjete: ");
        double distanca = s.nextDouble();

        System.out.print("Koje prevozno sredstvo zelite da koristite: ");
        String vozilo = s.next();

        switch(vozilo){
            case("Motor"):
                System.out.println("Potrosicete " + ((distanca * 5) / 100) + " litara goriva.");
                break;
            case("Automobil"):
                System.out.println("Potrosicete " + ((distanca * 7) / 100) + " litara goriva.");
                break;
            case("Kombi"):
                System.out.println("Potrosicete " + ((distanca * 11) / 100) + " litara goriva.");
                break;
            case("Kamion"):
                System.out.println("Potrosicete " + ((distanca * 15) / 100) + " litara goriva.");
                break;
            default:
                System.out.println("Uneli ste pogresan tip vozila.");
        }


    }
}
