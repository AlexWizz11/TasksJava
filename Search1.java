import java.io.*;
        import java.util.Random;

public class Search1
{
    public static void main(String[] args)
    {
        int[] array = new int[100];
        final Random random = new Random();
        for (int i = 0; i < array.length; ++i)
            array[i] = random.nextInt(2);

        try ( FileWriter writer = new FileWriter("F:/INPUT.txt", false))
        {
            for (int i = 0; i < array.length; ++i)
            {
                final String s = Integer.toString(array[i]);
                writer.write(s);

                System.out.println(s);
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
