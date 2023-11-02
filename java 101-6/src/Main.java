import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //**********ATM projesi*************

        //kulllanıcı adı ve şifre alma
        //şifreyi 3 kereden fazla girerse ban
        /*  String userName,password;
        Scanner input= new Scanner(System.in);
        int right=3;
        int balance=1500;
    //balance =bakiye ,select=seçim
        int select;
        while(right>0){
            System.out.print("Kullanıcı Adınız:");
            userName= input.nextLine();

            System.out.print("Şifreniz:");
            password= input.nextLine();

            if(userName.equals("selinux")&& password.equals("dev123"))
            {
                System.out.println("Sisteme Başarılı Bir Şekilde Giriş Yaptınız.");

               do { System.out.println("1- Para Yatırma \n" +
                           "2-Para Çekme \n" +
                           "3-Bakiye Sorgulama\n" +
                           "4-Çıkış Yap");
                   System.out.print(" Lütfen yapmak istediğiniz işlemi seçiniz:");
                   select=input.nextInt();

                   if(select==1)
                   {
                       System.out.println("Para miktari");
                       int price=input.nextInt();
                       balance+=price;
                   }
                   else if (select==2)
                   { System.out.println("Para miktari");
                       int price=input.nextInt();
                       if(price>balance){
                           System.out.println("BAKİYE YETERSİZ");
                       }
                       else{
                           balance-=price;
                       }
                   }
                   else if(select==3)
                   {
                       System.out.println("Bakiyeniz:"+ balance);
                   }
               }
               while(select !=4); // döngüden çıkış yapar
                System.out.print("Tekrar görüşmek üzere :)");

                break;
            }

            else{
                right --;
                System.out.println("Hatalı Kullanıcı Adı Veya şifre Girdiniz. Tekrar deneyiniz!");
                if(right==0)
                {System.out.println("Hesabınız Bloke Olmuştur Banka İle İletişime Geçiniz!");}
                System.out.println("Kalan Deneme Hakkınız:"+ right);
            }
        }*/

        // ATM projesinin switch - case hali
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        //balance =bakiye ,select=seçim
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız:");
            userName = input.nextLine();

            System.out.print("Şifreniz:");
            password = input.nextLine();

            if (userName.equals("selinux") && password.equals("dev123")) {
                System.out.println("Sisteme Başarılı Bir Şekilde Giriş Yaptınız.");

                do {
                    System.out.println("1- Para Yatırma \n" +
                            "2-Para Çekme \n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print(" Lütfen yapmak istediğiniz işlemi seçiniz:");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para miktari");
                            int price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.println("Para miktari");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("BAKİYE YETERSİZ");
                            } else {
                                balance -= price2;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz:" + balance);
                            break;

                        case 4:// döngüden çıkış yapar
                            System.out.print("Tekrar görüşmek üzere :)");
                            break;

                        default:
                            System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");
                    }

                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı Veya şifre Girdiniz. Tekrar deneyiniz!");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur Banka İle İletişime Geçiniz!");
                    System.out.println("Kalan Deneme Hakkınız:" + right);
                }
            }
        }
    }
}


