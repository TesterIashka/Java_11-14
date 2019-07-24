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
        String prov = "^[0-9]+[.]*[0-9]*$";
        System.out.println("Введите число с клавиауры: ");
        String anek = joke.nextLine();
        if (anek.matches(prov))
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
                 if (anek.contains("."))
                {
                    String anek_1 = anek.substring(0, anek.indexOf("."));
                    return anek_1;
                }
             else
                {
                    return anek;
                }
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
