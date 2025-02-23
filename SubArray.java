package SubArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SubArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int k = 2;
        printSubarrayAverage(arr, k);
    }

    private static void printSubarrayAverage(ArrayList<Integer> arr, int k) {
        LinkedList<Integer> subList = new LinkedList<>();

        // Сначала заполняем subList первыми k элементами
        for (int i = 0; i < k; i++) {
            subList.add(arr.get(i));
        }

        // Вычисляем и выводим среднее значение первого подмассива
        double average = calculateAverage(subList);
        System.out.println("Подмассив: " + subList + ", Среднее: " + average);

        // Теперь проходим по остальным элементам массива
        for (int i = k; i < arr.size(); i++) {
            subList.removeFirst(); // Удаляем первый элемент
            subList.add(arr.get(i)); // Добавляем новый элемент

            // Вычисляем и выводим среднее значение текущего подмассива
            average = calculateAverage(subList);
            System.out.println("Подмассив: " + subList + ", Среднее: " + average);
        }
    }

    private static double calculateAverage(LinkedList<Integer> subList) {
        double sum = 0;
        for (int num : subList) {
            sum += num;
        }
        return sum / subList.size();
    }
}






