import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int mat,fiz,turkce,kim,muz;
        double ortalama;

        System.out.println("Matematik notunuzu giriniz.:");
        mat=inp.nextInt();
        System.out.println("Fizik notunuzu giriniz.:");
        fiz=inp.nextInt();
        System.out.println("Türkce notunuzu giriniz.:");
        turkce=inp.nextInt();
        System.out.println("Kimya notunuzu giriniz.:");
        kim=inp.nextInt();
        System.out.println("Müzik notunuzu giriniz.:");
        muz=inp.nextInt();
        ortalama=(mat+fiz+turkce+kim+muz)/5;
        if(mat >0 && mat<101 &&fiz >0 && fiz<101 &&turkce >0 && turkce<101 && kim >0 && kim<101 && muz >0 && muz<101)
        {
            if(ortalama>=55)
            {
                System.out.println("ortalamanız:"+ortalama +" Geçtiniz");
            }
            else
            {
                System.out.println("ortalamanız.:"+ortalama+" kaldınız");
            }
        }
        else {
            System.out.println("not aralığın 0 ile 100 arası olmalı");
        }




    }

}