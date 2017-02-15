import java.io.*;
import java.util.Scanner;

public class Search2 {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "";
        Scanner in = new Scanner(new File("F:\\INPUT.txt"));
        while(in.hasNext())
            s += in.nextLine();
        in.close();
        char list[] = s.toCharArray();
        int num = 0;
        int max = 0;
        for(int i = 0; i < list.length; i++) {
            if (max < num)
                max = num;
            if (list[i] == "1".charAt(0))
                num++;
            else num = 0;
        }
        System.out.print(max);
        String max2 = Integer.toString(max);
        try ( FileWriter writer = new FileWriter("F:/OUTPUT.txt", false))
        {
            writer.write(max2);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

