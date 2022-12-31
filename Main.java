import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b;
double c;
        Scanner alan=new Scanner(System.in);
        System.out.print("1.dik kenarı giriniz: ");
        a=alan.nextInt();
        System.out.print("2.dik kenarı giriniz: ");
        b=alan.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenüs= " + c);
        int uçgeninalani=(a*b)/2;
        System.out.println("ucgeninalani: " +(a*b)/2);
        System.out.print("ucgenin çevresi" + (a+b+c));



    }

}
