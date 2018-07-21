package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int array, tmp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of integers: ");
        array = input.nextInt();
        int numbers[] = new int[array];
        System.out.println("Input numbers to be sorted: ");
            for (int i = 0; i < array; i++) {
                numbers[i] = input.nextInt();
            }
            for (int i = 0; i < array; i++) {
                for (int j = i+1; j < array; j++) {
                    if (numbers[i] > numbers[j])
                    {
                        tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(numbers));

    }
}
