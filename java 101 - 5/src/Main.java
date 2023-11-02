import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //java’da for, while ve do-while olmak üzere 3 adet döngü deyimi bulunmaktadır.

        // while(kosul){ //kod bloğu }
        // do { kodlar// } while (kosul);

        //for (durum 1; durum 2; durum 3) { // çalışacak kod bloğu }
        //for (int i = 0; i < 10; i++) { System.out.println(i); }

        /*kaç kere döneceği belli olmayan, koşulun bir
        girdiye göre denetlendiği durumlarda While ya
        da do-while döngüsü kullanılırken, diziler gibi,
        tekrar sayısı belirli olan durumlarda ise for döngüsü
        kullanılması tercih edilir*/

       /* for(int sayac=1;sayac<=10;sayac++){
            System.out.print(sayac);
        }*/

        // kullanıcı eksi değer girene kadar devam eden program
        /*  Scanner input = new Scanner(System.in);
       int sayi;
        for(boolean run =true; run;) // 3. durum boş bırakılabilir
        {
            System.out.println("sayi giriniz :");
            sayi= input.nextInt();
            if(sayi<0) { run =false; } // sayı 0 dan küçükse yani eksi değerli ise döbgü biter
        }
     * */

        // Continue ve Break Komutları

        // Java'da "continue" deyimi , döngü içinde bir koşul oluştuğunda ->
        // o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.

        // döngü koşulu sağlansa bile başka bir nedenden ötürü döngüyü sonlandırmak ->
        // isteyebiliriz. Bu tarz durumlarda break deyimini kullanırız.

        /*
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        //
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println(j);
        }*/

        //Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
        /*   int k;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        k= input.nextInt();

        for(int i=1;i<=k;i++)
        { if(i%2==0) // mod aldık %
        {System.out.println(i);}
        }*/

        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve
        // en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
        /*      int sayi,n;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        n= input.nextInt();
        int enB= Integer.MIN_VALUE;
        int enK= Integer.MAX_VALUE;

        for(int j =1;j<=n;j++)
        {
            System.out.print( j + ".sayıyı giriniz:");
            sayi = input.nextInt();

            if(sayi>enB){
                enB=sayi;
            }

            if(sayi< enK){
                enK=sayi;
            }
        }

        System.out.println("En büyük sayı: " + enB);
        System.out.println("En küçük sayı: " + enK);*/




    }
}