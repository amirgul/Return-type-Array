import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first Score");
        int firstScore = keyboard.nextInt();
        int[] nextScore = new int[10];
        for(int i = 0; i<nextScore.length; i++)
            nextScore[i] = firstScore + 5*i;

        double[] averages = arrayOfAverages(firstScore, nextScore);
        for(int i = 0; i<averages.length; i++)
        {
            if(i == 0)
            {
                System.out.print("{");
            }
            System.out.print(averages[i]);
            if(i != averages.length-1)
                System.out.print(",");

            if(i == averages.length-1)
                System.out.print("}");
        }


    }
    public static double getAverage(int n1, int n2)
    {
        return (n1 + n2)/2.0;
    }
    public static double[] arrayOfAverages(int firstScore, int[] nextScore)
    {
        double[] temp = new double[nextScore.length];
        for(int i = 0; i<temp.length; i++)
        {
            temp[i] = getAverage(firstScore, nextScore[i]);
        }
        return  temp;
    }
}
