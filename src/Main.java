import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int total=0,sayac=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = in.nextInt();

        for (int i =1; i<sayi; i++){
            if (i%12==0){
                total+=i;
                sayac++;
            }
        }
        System.out.println(total/sayac);

    }
}
