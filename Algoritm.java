import java.io.*;
import java.util.ArrayList;

public class Algoritm {
    public static void main(String[] args) throws Exception {
        while (true)  { //Выполняем алгоритм без остановки
            System.out.print("Insert number:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //задаем ввод числа с клавиатуры
            int number = Integer.parseInt(reader.readLine());
            int ans1;
            ArrayList ans = new ArrayList<Integer>();     //массив для хранения делителей
            for (int i = 1; i <= number; i++) {
                ans1 = number % i; //если число делится без остатка на делитель, его делитель - целочисленный
                if (ans1 == 0) {
                    ans.add(i);      //заполняем массив значениями делителей
                }
            }
            for (int i = 1; i < ans.size(); i++) {
                System.out.println(ans.get(i)); //вывод на экран всех элементов массив с хранящимися делителями
            }
        }
    }
}

