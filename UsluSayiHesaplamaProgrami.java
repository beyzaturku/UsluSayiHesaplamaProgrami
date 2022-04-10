package uslusayihesaplamaprogrami;
import java.util.*;
public class UsluSayiHesaplamaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz:");
        int n = input.nextInt();
        System.out.print("Üs sayıyı giriniz:");
        int r = input.nextInt();
        
        int toplam =1;
        
        for(int i=1; i<=r ; i++)
        {
           toplam *= n;
           
        }
     
        System.out.println(n + "^" + r + "=" + toplam);
        
    }
    
}