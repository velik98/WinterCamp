package org.example;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
         if (isEven(i)) {
                System.out.print("Baz");
            }
            if (isDivisible5(i)) {
                System.out.print("inga!");
            }
            if (!isEven(i) && !isDivisible5(i)) System.out.print(i);
            System.out.print('\n');
        }

    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static boolean isDivisible5(int number) {
        return number % 5 == 0;
    }
}