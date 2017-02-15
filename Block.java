import java.io.*;

/**
 * Created by User on 2/3/2017.
 */
public class Fibonacci {
    public static void main(String[] args) throws Exception {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //ввод числа
            int in = Integer.parseInt(reader.readLine());
            int pr = 0;
            int this1 = 0;
            int next = 1;

            while (this1 != in) { //первый цикл с переопределением переменных
                pr = this1;
                this1 = next;
                next = this1 + pr;
                if (this1 == in)
                    System.out.println("yes"); //исходное условие для проверки соответсвия числа ряду
                if (this1 > in) {
                    System.out.println("No"); //дополнительное условие для исключения некорректной работы
                    break;
                }
            }

        }
    }
}


