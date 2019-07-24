import java.util.Scanner;

public class Zadanie_13
{
    public static void main (String args[])
    {
        Scanner joke = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String anek = joke.nextLine();
        System.out.println("Введите вторую строку: ");
        String anek_1 = joke.nextLine();
        if (anek.length() == anek_1.length())
        {
            System.out.println("Введенные строки равны по длине");
        }
        else
        {
            if (anek.length() > anek_1.length())
            {
                System.out.println("Строка с наибольшей длиной: "+ anek);
            }
            else
            {
                System.out.println("Строка с наибольшей длиной: "+ anek_1);
            }
        }
     }
}
