import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();
            scanner.close();

            if (isAsal(sayi, 2)) {
                System.out.println(sayi + " bir asal sayıdır.");
            } else {
                System.out.println(sayi + " bir asal sayı değildir.");
            }
        }

        public static boolean isAsal(int sayi, int bolen) {
            if (sayi <= 2) {
                return (sayi == 2) ? true : false;
            }
            if (sayi % bolen == 0) {
                return false;
            }
            if (bolen * bolen > sayi) {
                return true;
            }
            return isAsal(sayi, bolen + 1);
        }
    }
