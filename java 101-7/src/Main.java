// metodlar
// Return (geri dönüşü olan) , Void (geri dönüşü olmayan) metotlar tanımı
// Metotlarda Overloading (Aşırı Yüklenme)
// Metotlarda Local Değişken Yapıları
// Recursive Özyineli Metotlar
// Palindrom Sayı Bulan Program

public class Main {

    // metoda ait kod bloğu - üs alma
        /*  static int power(int base,int exp){
        int  result=1;

        for(int i=1;i<=exp;i++){result*=base;}

        return result; //dönüş anlamı katar-
    } */

    // metoda ait kod bloğu- 2
        /* static int sum(int a,int b){
        return a+b; // geriye döndürülen değer}
    */

    // metoda ait kod bloğu- 3
        /*   static void sum(int a, int b){
        int result=a+b;
        System.out.println(result);
    }*/

    // Recursive Özyineli Metotlar - geriye değer döndürmek içn void yerine int kullanılır
      /* static int f (int n) {
       int result=0;
      for(int i =1; i<=n;i++){ result+=1;}
      return result;
    }*/

      /*  static int r(int n)
    {   System.out.println(n);
        return r(n-1)+n;
    }
*/

    // Palindrom Sayı Bulan Program-- sayıyı tersine döndürüyoruz
    static boolean isPalindrom(int number){
        int temp=number, reverseNumber=0 ,lastNumber; // sayıyı sıfırlar
        while (temp !=0)
        {
            System.out.println("========");
            System.out.println("Sayı => "+temp);

            lastNumber = temp % 10;
            System.out.println("Son Basamak => "+lastNumber);

            reverseNumber= (reverseNumber * 10)+  lastNumber;
            System.out.println("Yeni Sayı => "+reverseNumber);

            temp /=10;
            System.out.println("Yeni Temp => "+temp);
        }

        if(number == reverseNumber)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        // metodlar -fonksiyonlar
        //f(x)=2x+5

        // üs alma işlemi
        /*  int base=2, exp=3,result=1; //base üs- exp alt
        for(int i=1;i<=3;i++)
        {
            result*=base;
        }

        System.out.println(result);*/

        // tanımladığımız metodu çağırıyoruz - üs alma
        /*
        int case1 =power(2,3); // direkt sayı yazılır
        int case2 =power(4,5);
        System.out.println(case1);
        System.out.println(case2);*/

        /*Java'da iki tür metot mevcuttur bunlar :
        Return (geri dönüşü olan) , Void (geri dönüşü olmayan) metotlar.
        Return metotlar çağrıldığında geriye bir değer döndürürken,
        Void metotlar geriye bir değer döndürmemektedir.*/

        //2
        /*
       *  int result=sum(5, 2);
        System.out.println(result);

        int result2=sum(5, 2)+sum(2,9);
        System.out.println(result2);
        */

        //3 - geriye değer dönmeyen - atama yapamayız
        // sum(5,3);

        /*Java'da, iki veya daha fazla metot, parametreler açısından
        farklılık gösteriyorsa (farklı sayıda parametre, farklı türde
        parametre veya her ikisi) aynı isime sahip olabilir. Bu duruma
        metotlarda "Overloading" yani aşırı yüklenme işlemi denir.

        Aşırı yüklenmiş metotlar aynı veya farklı dönüş türlerine
        sahip olabilir, ancak parametreler açısından farklılık
        göstermeleri gerekir.*/

        //Metotlarda Local Değişken Yapıları
        /*   int a=5;
        if(a<10){
            int b=20;
            System.out.println(b);
        }*/
        // System.out.println(b); --> yanlış çünkü if içinde olması gerekir şarta bağlıdır-gerekli kod blokları arasında olması gerekir


        //Recursive Özyineli Metotlar
        //Java'da Recursive Metotlar, bir metodun kendisini çağırma tekniğidir.

       // System.out.println(f(3));
       // System.out.println(r(10));

       // Palindrom Sayı Bulan Program
        //isPalindrom(247); // 742
        isPalindrom(44);









    }
}