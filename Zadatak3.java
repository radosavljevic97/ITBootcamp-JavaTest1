package JavaTest1;

//Napisite program koji, koristeci WHILE petlju, racuna zbir unetih brojeva (svi brojevi su tipa int), sve dok korisnik ne unese 0

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int suma = 0;

        int i = 1;
        while(i != 0){
            System.out.println("Molim vas unesite " + i + ". broj: ");
            int broj = s.nextInt();
            if(broj == 0){
                System.out.println("Uneli ste 0. Kraj programa.");
                break;
            }
            suma = suma + broj;
            System.out.println("Trenutni zbir je " + suma);

            i++;
        }





    }
}
