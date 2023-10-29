import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ? mantıksal operatoru
        // ( kontrol edilecek ifade ) ? doğru olması durumunda yapılacaklar : yanlış olması durumunda yapılacaklar
         /*  int a = 10, b = 20, c;
        c = (a == b) ? 1 : 2;
        System.out.println(c);*/

        //if-else
        // Kan verme durumunu ölçme uygulaması
        /*
      *   int age = 25;
        int weight = 48;

        if (age >= 18) {
            if (weight >= 48) {
                System.out.println("Kan verebilirsiniz");
            } else {
                System.out.println("Kan veremezsiniz");
            }
        } else {
            System.out.println("Kan verebilmek için yaşınız 18'den büyük olmalıdır.");
*/

        // Switch-Case Yapısı
        /*
             * switch(değer)
             * {
             * case x: // değer x'e eşitse bu kod bloğu çalışacak
             * break;
             * case y: // değer y'ye eşitse bu kod bloğu çalışacak
             * break;
             * default: // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
             * }
             * */

        /*int gun = 2;
            switch (gun) {
                case 1:
                    System.out.println("Bugün pazartesidir.");
                    break;
                case 2:
                    System.out.println("Bugün salıdır.");
                    break;
                case 3:
                    System.out.println("Bugün çarşambadır.");
                    break;
                case 4:
                    System.out.println("Bugün perşembedir.");
                    break;
                case 5:
                    System.out.println("Bugün cumadır.");
                    break;
                case 6:
                    System.out.println("Bugün cumarteisidr.");
                    break;
                case 7:
                    System.out.println("Bugün pazardır.");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
            }*/

        //kullanıcı girişi örnek
        /* String kulAd, kulSif;
                Scanner inp=new Scanner(System.in);

                System.out.print("Kullanıcı adınız:");
                kulAd=inp.nextLine();

                System.out.print("Şifreniz:");
                kulSif=inp.nextLine();

                // string ile koşullu yapılarda (___.equals) kullanılır.
                if(kulAd.equals("selin")&& kulSif.equals("selinjava101"))
                {
                    System.out.print("Giriş Yaptınız !");
                }
                else
                {
                    System.out.print("Bilgileriniz Yanlış");
                }*/

        //Burç Bulan Program
        /*
        *       int ay , gun ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz :");
        ay=inp.nextInt();

        System.out.print("Doğduğunuz günü giriniz");
        gun=inp.nextInt();

        switch(ay){
            case 1:
                if (gun>=1 && gun <=31){
                    if (gun<22){System.out.println("Oğlak Burcu");}
                    else{System.out.println("Kova Burcu");}
                }
               else{ System.out.println("Geçersiz bir gün girdiniz!");}
               break;

               case 2:
                   if(gun>=1 && gun <=28){
                       if (gun<20){System.out.println("Kova Burcu");}
                       else{System.out.println("Balık Burcu");}
                   }
                   else{ System.out.println("Geçersiz bir gün girdiniz!");}
                   break;
            case 3:
                if(gun>=1 && gun <=31){
                    if (gun<21){System.out.println("Balık Burcu");}
                    else{System.out.println("Koç Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            case 4:
                if(gun>=1 && gun <=30){
                    if (gun<21){System.out.println("Koç Burcu");}
                    else{System.out.println("Boğa Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            case 5:
                if(gun>=1 && gun <=31){
                    if (gun<22){System.out.println("Boğa Burcu");}
                    else{System.out.println("İkizler Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            case 6:
                if(gun>=1 && gun <=30){
                    if (gun<23){System.out.println("İkizler Burcu");}
                    else{System.out.println("Yengeç Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            case 7:
                if(gun>=1 && gun <=31){
                    if (gun<23){System.out.println("Yengeç Burcu");}
                    else{System.out.println("Aslan Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            case 8:
                if(gun>=1 && gun <=31){
                    if (gun<23){System.out.println("Aslan Burcu");}
                    else{System.out.println("Başak Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            case 9:
                if(gun>=1 && gun <=30){
                    if (gun<23){System.out.println("Başak Burcu");}
                    else{System.out.println("Terazi Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            case 10:
                if(gun>=1 && gun <=31){
                    if (gun<23){System.out.println("Terazi Burcu");}
                    else{System.out.println("Akrep Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            case 11:
                if(gun>=1 && gun <=30){
                    if (gun<22){System.out.println("Akrep Burcu");}
                    else{System.out.println("Yay Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            case 12:
                if(gun>=1 && gun <=31){
                    if (gun<22){System.out.println("Yay Burcu");}
                    else{System.out.println("Oğlak Burcu");}
                }
                else{ System.out.println("Geçersiz bir gün girdiniz!");}
                break;

            default:
                System.out.println("Hatalı bir ay girdiniz!");
                break;
        }*/


        }
    }
