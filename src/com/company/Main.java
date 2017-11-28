package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int input = scanner.nextInt();
        int counter = 0;   //счетчик колличества выведенных натуральных чисел
        for (int i = 2; ; i++) {
            for (int j = 3; ; j++) {
                if (relativelyPrimeNumbers(i, j)) {
                    System.out.println(i + " " + j);
                    counter++;
                    if (counter == input) {
                        break;
                    }
                }
            }
            if (counter == input) {
                break;
            }
        }
    }
    public static boolean relativelyPrimeNumbers(int numberFirst, int numberSecond){
        boolean relative=true;
        int maxOfNumbers=Math.max(numberFirst,numberSecond);
        for(int i=2;i<=maxOfNumbers;i++){
                if(numberFirst%i==0 && numberSecond%i==0){
                        relative=false;
                        break;
                }
            }
        return relative;
        }
}
