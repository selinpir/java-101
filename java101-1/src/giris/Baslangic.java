package giris;

// import java.util.Scanner; = kullanıcıdan veri almak için girilmesi gereken bir deyimdir.
import java.util.Scanner;

public class Baslangic {
    //package,class,main,
    //main referans noktamiz, programı baslatir
    //yazdirma = System.out.print();

    public static void main(String[] args) {
        System.out.print("Merhaba,suan Selin'in java notlarindasin,iyi calismalar! \n");
        int numberOne;
        numberOne=10;
        int numberTwo=12;
        int numberThree=numberOne+numberTwo;
        System.out.println(numberThree);

        // byte,short,int,long,
        byte a = 120;
        short b = 1000;
        int c = 100000;
        long d = 10000000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //float double
        // Float ile double ayırmak için , float tanımlamalardan sonra ‘f’ veya ‘F’ konulmalıdır.
        float number1 = 3.14F;
        float number2 = 3.14f;

        double number3 = 3.14;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        // char(karakter tutucu),boolean(mantiksal operator)
        char vchar = 's';
        char vchar2 = 98; //ASCII kod ama tırnak koyulmaz

        boolean logic1 = true;
        boolean logic2 = false;

        System.out.println(vchar);
        System.out.println(vchar2);

        System.out.println(logic1);
        System.out.println(logic2);

        //string = kelime tutmak için
        String vStr="Java101 Patikası";
        System.out.println(vStr);

        // operatorler
        int x = 5, y =2;
        System.out.println(x%y);

        /*
        * a+b / a-b / a*b / a/b / a%b(mod alma)
        * 1 arttirma : a++
        * 1 eksiltme : a--
        * a==b / a!=b / a<b / a>b / a<=b / a>=b
        * ve a&&b
        * veya a||b
        * degil !(a&&b)
        * */

        //false
        int v =5 , n=6;
        boolean sonuc1 = v==n;
        System.out.println( sonuc1);

        //true
        int f =5 , g=6;
        boolean sonuc2 = f!=g;
        System.out.println( sonuc2);

        //Kullanıcıdan Veri Alma
        //sıralı yazmak önemli scanner den sonra veri almalıyız.
        int l;
        Scanner input =new Scanner(System.in);
        System.out.println("L sayisini giriniz :");
        l= input.nextInt();
        System.out.println(l);

        /* tanımlanan türe göre kullanıcı veri girişi olmalıdır,double
        veri türüne 1.5 girilirse hata alınır ama 1,5 girilebilir
         */

        Scanner input2 =new Scanner(System.in);
        System.out.println("double bir veri giriniz:");
        double db=input2.nextDouble();
        System.out.println(db);

















    }


    }






