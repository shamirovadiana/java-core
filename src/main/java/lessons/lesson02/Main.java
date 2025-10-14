package lessons.lesson02;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        printTriangles();
    }
    //вывести числа от 1 до 100
    public static void printHundredNUms(){
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if(i%10==0){
                System.out.println("\n");
            }
        }
    }
    //сумма чисел от 1 до N
    public static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int lastNum = in.nextInt();
        int result = 0;
        for(int i = 1; i <= lastNum; i++){
            result += i;
        }
        System.out.println(String.format("Сумма чисел от 1 до %s равна %s",lastNum,result));
    }
    //произведение чисел от 1 до N
    public static void multiplication(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int lastNum = in.nextInt();
        long result = 1;
        for(int i = 1; i <= lastNum; i++){
            result *= i;
        }
        System.out.println(String.format("Произведение чисел от 1 до %s равна %s",lastNum,result));
    }
    //сумма чётных чисел от 1 до N
    public static void evenNumsSum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int lastNum = in.nextInt();
        int result = 0;
        for(int i = 1; i <= lastNum; i++){
            if(i % 2 == 0){result += i;}
        }
        System.out.println(String.format("Сумма чётных чисел от 1 до %s равна %s",lastNum,result));
    }
    //сумма цифр числа
    public static void digitsSum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String num = in.nextLine();
        int result = 0;
        for(int i = 0; i<num.length(); i++){
            result += Character.getNumericValue(num.charAt(i));
        }
        System.out.println(String.format("Сумма цифр %s равна %s",num,result));
    }
    //разворот числа
    public static void reverse(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String num = in.nextLine();
        String reversedNum = "";
        for(int i = num.length() - 1; i >= 0; i--){
            reversedNum = reversedNum.concat(Character.toString(num.charAt(i)));
        }
        System.out.println(reversedNum);
    }
    //найти факториал N
    public static void factorial(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int lastNum = in.nextInt();
        long result = 1;
        int i = 1;
        while(i <= lastNum){
            result *= i;
            i++;
        }
        System.out.println(String.format("Факториал числа %s равна %s",lastNum,result));
    }
    //найти первое число, которое делится на 7 и больше 1000
    public static void firstNumDivisibleBySeven(){
        int divisibleBySeven = 0;
        for(int i = 1000;;i++){
            if(i%7==0){
                divisibleBySeven = i;
                break;
            }
        }
        System.out.println(String.format("Первое число, которое делится на 7 и больше 1000, равно %s", divisibleBySeven));
    }
    //вывести все простые числа до N
    public static void printPrimeNums(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        System.out.println(String.format("Все простые числа до числа %s :", num));
        int dividerCount = 0;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i;j++){
                if(i%j == 0){
                    dividerCount++;

                }
            }
            if(dividerCount<=2){
                System.out.print(i + " ");
            }
            dividerCount = 0;
        }
    }
    //нарисовать треугольники
    public static void printTriangles(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        String base = "*";
        String space = " ";
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(base);
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num - i; j++){
                System.out.print(base);
            }
            System.out.println();

        }

    }

}

