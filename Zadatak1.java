package JavaTest1;

//Napisite niz od 10 elemenata i koristeci FOR petlju pronadjite najveci broj u nizu
//niz je tipa int
//Primer niza {3, 5, 4, 11, -1, 23, 5, 43, 0, 5}
//Primer ispisa resenja u konzoli:
//Najveci broj u nizu je 43

public class Zadatak1 {
    public static void main(String[] args) {

        int[] niz = {15, 12, 3, 7, 99, 65, 17, 44, 55, 20};
        int max = niz[0];


        for(int i = 0; i < niz.length; i++){
            if(max < niz[i]){
                max = niz[i];
            }
        }
        System.out.println(max);

    }
}
