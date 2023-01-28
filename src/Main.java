import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int mat,fiz,turk,kim,muz;
        double ortalama;
        System.out.print("Matematik Notunu Giriniz: ");
        mat=input.nextInt();
        System.out.print("Fizik Notunu Giriniz: ");
        fiz=input.nextInt();
        System.out.print("Türkçe Notunu Giriniz: ");
        turk=input.nextInt();
        System.out.print("Kimya Notunu Giriniz: ");
        kim=input.nextInt();
        System.out.print("Müzik Notunu Giriniz: ");
        muz=input.nextInt();
        ortalama=(mat+fiz+turk+kim+muz)/5;
        if (ortalama>=55){
            System.out.println("Geçti");
        }
        else {
            System.out.println("Kaldı");
        }

    }
}