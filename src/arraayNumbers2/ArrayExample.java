package arraayNumbers2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandum() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sach phan tu cua mang");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
            
        }
        return arr ;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();

        Integer[]arr = arrayExample.createRandum();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui long nhap chi so mot phan tu bat ki");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri cua phan tu co chi so 5" + x + "la" + arr[x]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println(" chi so vuot qua gioi han cua mang");
        }
    }
}
