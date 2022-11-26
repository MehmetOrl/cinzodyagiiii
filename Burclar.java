import java.util.Scanner;
public class Burclar {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int gun ,ay;
        System.out.println("Rakam ile Ay Giriniz.:");
        ay=giris.nextInt();
        System.out.println("Gün Giriniz.:");
        gun=giris.nextInt();

       if(ay==1)
       {
           if(gun>=1 && gun <22) {
               System.out.println("Burcunuz Oğlak");
           }
           else if (gun>=23&&gun<32)
           {
               System.out.println("Burcunuz Kova");
           }
            else
           {
               System.out.println("ocak ayının gün aralığı 1 ile 31 dir aralık dışına çıktınız");
           }

       }
        if(ay==2)
        {
            if(gun>=1 && gun <20) {
                System.out.println("Burcunuz Kova");
            }
            else if (gun>=20&&gun<29)
            {
                System.out.println("Burcunuz Balık");
            }
            else
            {
                System.out.println("Şubat ayının gün aralığı 1 ile 28 dir aralık dışına çıktınız");
            }

        }
        if(ay==3)
        {
            if(gun>=1 && gun <21) {
                System.out.println("Burcunuz Balık");
            }
            else if (gun>=21&&gun<32)
            {
                System.out.println("Burcunuz Koç");
            }
            else
            {
                System.out.println("Mart ayının gün aralığı 1 ile 31 dir aralık dışına çıktınız");
            }

        }
        if(ay==4)
        {
            if(gun>=1 && gun <21) {
                System.out.println("Burcunuz Koç");
            }
            else if (gun>=21&&gun<31)
            {
                System.out.println("Burcunuz Boğa");
            }
            else
            {
                System.out.println("Nisan ayının gün aralığı 1 ile 31 dir aralık dışına çıktınız");
            }

        }
        if(ay==5)
        {
            if(gun>=1 && gun <22) {
                System.out.println("Burcunuz Boğa");
            }
            else if (gun>=22&&gun<31)
            {
                System.out.println("Burcunuz İkizler");
            }
            else
            {
                System.out.println("Nisan ayının gün aralığı 1 ile 31 dir aralık dışına çıktınız");
            }

        }



       }

    }


