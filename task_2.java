import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер списка:");
        int listSize = input.nextInt();
        List inList = new ArrayList<>();
        List outList = new ArrayList<>();
        for (int i = 1; i < listSize + 1; i++){
            inList.add(i);  // Заполняем список inList
        }
        System.out.print("Необработанный список:\t");
        for (int i = 0; i < inList.size(); i++){
            System.out.print(inList.get(i)+" ");// Печатаем элементы списка inList
        }
        System.out.print("\nОбработанный список:\t");
        for (int i = 0; i < inList.size(); i++){
            int temp = (Integer) inList.get(i);
            if (temp % 2 != 0){             // Проверяем на четность
                outList.add(temp);          // Заполняем лист outList
                System.out.print(temp+" "); // Печатаем элементы листа outList
            }
        }
    }
}
