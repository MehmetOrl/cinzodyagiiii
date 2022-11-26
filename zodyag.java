import java.util.Scanner;
public class zodyag {
    public static void main(String[] args) {
        Scanner girdii=new Scanner(System.in);
        int dogumYili;
        System.out.println("Doğum yılı giriniz.:");
        dogumYili=girdii.nextInt();
        if(dogumYili>0)
        {
        if(dogumYili%12==0)
        {
            System.out.println("Çin zodyağı burcunuz.: Maymun");
        }
        else if(dogumYili%12==1)
        {
            System.out.println("Çin zodyağı burcunuz.: Horoz");
        }
        else if(dogumYili%12==2)
        {
            System.out.println("Çin zodyağı burcunuz.: Köpek");
        }
        else if(dogumYili%12==3)
        {
            System.out.println("Çin zodyağı burcunuz.: Domuz");
        }
        else if(dogumYili%12==4)
        {
            System.out.println("Çin zodyağı burcunuz.: Fare");
        }
        else if(dogumYili%12==5)
        {
            System.out.println("Çin zodyağı burcunuz.: Öküz");
        }
        else if(dogumYili%12==6)
        {
            System.out.println("Çin zodyağı burcunuz.: Kaplan");
        }
        else if(dogumYili%12==7)
        {
            System.out.println("Çin zodyağı burcunuz.: Tavşan");
        }
        else if(dogumYili%12==8)
        {
            System.out.println("Çin zodyağı burcunuz.: Ejderha");
        }
        else if(dogumYili%12==9)
        {
            System.out.println("Çin zodyağı burcunuz.: Yılan");
        }
        else if(dogumYili%12==10)
        {
            System.out.println("Çin zodyağı burcunuz.: At");
        }
        else if(dogumYili%12==11)
        {
            System.out.println("Çin zodyağı burcunuz.: Koyun");
        }

    }
    }
}
