import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //not ortalaması hesaplama-1
        /*    int mat,fizik,kimya,trkc,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        mat= input.nextInt();

        System.out.println("Fizik notunuz:");
        fizik=input.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya=input.nextInt();

        System.out.println("Türkçe notunuz:");
        trkc=input.nextInt();

        System.out.println("Tarih notunuz:");
        tarih= input.nextInt();

        System.out.println("Müzik notunuz:");
        muzik=input.nextInt();

        int notToplam=(mat+fizik+kimya+trkc+tarih+muzik);
        double sonuc= notToplam/6.0;

        String sonucMetni = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("6 dersinizin ortalaması: \n" + sonuc +sonucMetni);
        */

        // KDV Tutarı Hesaplama-2
        /* double tutar ,kdvOran=0.18;
        Scanner input2 =new Scanner(System.in);
        System.out.print("ücreti giriniz:");
        tutar= input2.nextDouble();

        double KdvTutar =tutar * kdvOran;
        System.out.println(KdvTutar);

        double kdvliTutar= tutar+KdvTutar;

        System.out.println("KDV Oranı:"+ kdvOran);
        System.out.println("KDV tutarı:"+ KdvTutar);
        System.out.println("KDV li tutarı:"+kdvliTutar);

         */

        // Vücut Kitle İndeksi Hesaplama -3
        //Kilo (kg) / Boy(m) * Boy(m)

        Scanner input3 =new Scanner(System.in);

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz:");
        double boy = input3.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz:");
        double kilo = input3.nextDouble();


        double index=kilo/(boy*boy);

        System.out.println("Vücut kitle indeksiniz:" +index);






    }
}