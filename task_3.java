import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер списка:");
        int listSize = input.nextInt();
        System.out.print("Максимальное значение элементов списка:");
        int maxListValue = input.nextInt();
        Random randNumber = new Random();
        List newList = new ArrayList<>();
        int min     = 0;
        int max     = 0;
        double sum     = 0.0;
        for (int i = 0; i < listSize; i++){
            int elem = randNumber.nextInt(1, maxListValue);
            newList.add(elem);
        }
        min = (Integer) newList.get(0);
        System.out.print("Заданный список: ");
        for (Object i : newList){
            int elem = (Integer) i;
            System.out.print(elem+" ");
            if (elem < min){
                min = elem;
            }
            if (elem > max){
                max = elem;
            }
            sum = sum+elem;
        }
        double middle = sum / listSize;
        System.out.println("\nМинимальное значение: "+min);
        System.out.println("Максимальное значение: "+max);
        System.out.println("\nСумма значений: "+sum);
        System.out.println("Среднее значение элемента списка: "+middle);
    }
}
