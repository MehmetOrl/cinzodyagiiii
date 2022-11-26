import java.nio.file.LinkPermission;
import java.util.Scanner;
public class HavaDurumu {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double sicaklik;
        System.out.print("Sıcaklığı Giriniz.:");
        sicaklik=in.nextDouble();
        if(sicaklik<5)
        {
            System.out.println("Sıcaklık.:"+sicaklik+"Kayak yapabilirsiniz.:");
        }
        else if (sicaklik>=5 && sicaklik<10)
        {
            System.out.println("sicaklik.:"+sicaklik+" Sinemaya gidebilirsiniz.:");
        } else if (sicaklik>=10 && sicaklik<16)
        {
            System.out.println(" Piknik yapıp sinemaya gidebilirsiniz.:");
            
        }
       else if(sicaklik>15 && sicaklik<26)
        {
            System.out.println("yüzmeye gidebilirsiniz.:");
        }
        in.close();

    }
}
