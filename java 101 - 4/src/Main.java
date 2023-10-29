import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // uçak bileti hesaplama programı
        // alınacak veriler= mesafe km- Mesafe başına ücret 0,10 TL / km
        // yaş - yolculuk tipi: tek yön / gidiş dönüş 2

        /*Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi (km) giriniz: ");
        int mesafe= input.nextInt();

        System.out.print("Yaşınzı giriniz: ");
        int yolcuYas= input.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1: Tek Yön, 2: Gidiş-Dönüş) ");
        int yolTipi= input.nextInt();

        if(mesafe<0 || yolcuYas<0 || (yolTipi !=1 && yolTipi !=2))
        {
            System.out.println("Hatalı veri girdiniz!");
        }
        else {
            double normalTutar=mesafe* 0.10;

            double yasIndirimi=0;
            if(yolcuYas<12)
            {yasIndirimi=normalTutar*0.50;}
            else if(yolcuYas>=12 && yolcuYas<=24)
            {yasIndirimi=normalTutar*0.10;}
            else if(yolcuYas>=65)
            {yasIndirimi=normalTutar*0.30;}

        double indirimliTutar=normalTutar-yasIndirimi;

        double gidDonIndirimi=0;
        if(yolTipi==2)
        {gidDonIndirimi=indirimliTutar*0.20;}

        double toplamTutar=(indirimliTutar-gidDonIndirimi)*(yolTipi==2 ? 2:1);
       System.out.println("TOPLAM TUTAR:"+toplamTutar+"TL");
        }


    }
}