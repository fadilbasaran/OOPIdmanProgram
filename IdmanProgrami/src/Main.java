
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Idman Programı
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Idman Progrmına Hoşgeldiniz...");
        
        String idmanlar="Geçerli Hareketler...\n"
                        +"Burpee\n"
                        +"Pushup(Şınav)\n"
                        +"Situp(Mekik)\n"
                        +"Squat";
        
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun...");
        
        System.out.print("Burpee Sayısı : ");
        int burpee=scanner.nextInt();
        
        System.out.print("Pushup Sayısı : ");
        int pushup=scanner.nextInt();
        
        System.out.print("Situp Sayısı : ");
        int situp=scanner.nextInt();
        
        System.out.print("Squat Sayısı : ");
        int squat=scanner.nextInt();
        
        scanner.nextLine();//nextLineden sonra nextInt aldığımızda scanner hatası verecektir bunun önüne geçmek için bunu kullanıyoruz
        Idman idman=new Idman(burpee, pushup, situp, squat);
        
        System.out.println("Idman başlıyor....");
        
        while (idman.idmanBittiMi()==false) {//idmanımız bitmediyse hep false değer döndürecek ve idmanımız bitmeyecek            
            System.out.print("Hareket Türü(Burpee, Pushup, Situp, Squat) : ");
            String tur=scanner.nextLine();
            while (true) {//Kullanıcının geçerli bir hareket girmesini istiyoruz                
                if (tur.equals("Burpee")||tur.equals("Pushup")||tur.equals("Situp")||tur.equals("Squat")) {
                break;
                }
                else{
                System.err.print("Lütfen Geçerli Bir Hareket Türü(Burpee, Pushup, Situp, Squat) Giriniz:");
                tur=scanner.nextLine();
                }
            }
            System.out.print("Bu hareketten kaç tane yapacaksınız ? : ");
            int sayi=scanner.nextInt();
            scanner.nextLine();//nextLineden sonra nextInt aldığımızda scanner hatası verecektir bunun önüne geçmek için bunu kullanıyoruz
            
            idman.hareketYap(tur, sayi);
            
        }
        System.err.println("İdman bitti. Tekrar beklelriz...");
        
    }
}
