import java.util.Scanner;

public class Zadanie_14
{
    public static void main (String args[])
    {
        String q = hello();
        System.out.println("String"+"   "+"int"+"      "+"double");
        System.out.println("  "+q+"     "+ hi(q)+"       "+bonjour(hi(q)));
    }
    private static String hello()
    {
        Scanner joke = new Scanner(System.in);
        String prov = "-*\\d+.*\\d+";
        String prov_1 = "-*\\d+";
        System.out.println("Введите число с клавиауры: ");
        String anek = joke.nextLine();
        if (anek.matches(prov_1))
        {
            return anek;
        }
        else
            {
            while (!anek.matches(prov))
            {
                System.out.println("Вы ввели не число! Введите число:");
                anek = joke.nextLine();
            }
            String anek_1 = anek.substring(0, anek.indexOf("."));
            return anek_1;
            }
    }
    private static int hi(String A)
    {
        int b = Integer.parseInt(A);
        return b;
    }

    private static double bonjour(int X)
    {
        double Y = X;
        return Y;
    }

}
