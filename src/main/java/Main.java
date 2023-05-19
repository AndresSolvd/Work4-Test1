package main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Array Length");
        int number = scanner.nextInt();

        int[] arr = createArray(number);

        getSum(arr);
    }

    public static int getSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        if (sum == 0) {
            System.out.println("there are no even numbers in the Array");
        } else {
            System.out.println("The sum of even numbers is: " + sum);
        }
        return sum;
    }

    public static int[] createArray(int number) {
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.print("The Array is: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        return arr;
    }
}