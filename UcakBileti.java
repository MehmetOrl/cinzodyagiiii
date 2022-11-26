import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int mesafe,tip,yas;
        double tutar,yasIndirimi65,yasIndirim24,yasIndirim11,x65,y11,z24,a65,b11,c24;
        System.out.println("Yolculuk mesafesi nedir.:(km cinsinden)");
        mesafe=i.nextInt();
        System.out.println("Yolculuk tipi.:(1:Tek Yön 2:Gidiş Dönüş) ");
        tip=i.nextInt();
        System.out.println("Yaşınız Nedir");
        yas=i.nextInt();
        tutar=mesafe*0.10;
        yasIndirimi65=tutar*0.30;
        yasIndirim24=tutar*0.10;
        yasIndirim11=tutar*0.50;
        x65=tutar-yasIndirimi65;
        y11=tutar-yasIndirim11;
        z24=tutar-yasIndirim24;
        a65=x65*0.20;
        b11=y11*0.20;
        c24=z24*0.20;
        if(yas>0 && tip>0&&tip<3&& mesafe>0)
        {
            switch (tip)
            {
                case 1:
                {
                    if(yas<12)
                    {

                        System.out.println("Yaş aralığı 12 den künük oluğu için tutar.:"+y11);
                    }
                    else if (yas>11&&yas<25)
                    {
                        System.out.println("Yaş aralığı 12-24 olduğu için toplam tutar.:"+z24);
                    }

                    else if (yas>65)
                    {

                        System.out.println("65 yaş üzeri olduğunuz için tutar.:"+x65);

                    }
                    else
                    {
                        System.out.println("borcunuz:"+tutar);
                    }
                }
                break;
            case 2:
            {
                if (yas < 12) {
                    System.out.println("toplam tutarınız 12 den küçük.:" + (b11 - y11)*2);

                }
                else if(yas>65)
                {
                    System.out.println("toplam tutarınız 65den büyük.:"+(x65-a65)*2);
                }
                else if(yas>11&& yas<25)
                {
                    System.out.println("toplam tutarınız 12-24.:"+(z24-c24)*2);
                }
                break;
            }
        }
        }
        else
        {
            System.out.println("hatalı veri girdiniz.:");
        }
    }
}

