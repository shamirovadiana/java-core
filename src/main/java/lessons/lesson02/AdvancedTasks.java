package lessons.lesson02;

import java.util.Scanner;

public class AdvancedTasks {
    //обмен значений
    public static void exchangeNums(){
        Scanner in = new Scanner(System.in);
        int quantity = 2;
        int nums[] = new int[quantity];
        for(int i = 0; i < quantity; i++){
            System.out.println(String.format("Введите %s число: ",i+1));
            nums[i] = in.nextInt();
        }
        System.out.println("Введённые числа в обратном порядке:");
        for(int i = quantity - 1; i>=0; i--){
            System.out.print(nums[i] + " ");
        }
    }
    //таблица умножения
    public static void printMultiplicationTable(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цифру, для которой хотите увидеть таблицу умножения:");
        int num = in.nextInt();
        int result = 0;
        if(num == 0){
            System.out.println("Любое число, умноженное на 0, равно 0");
        }
        for(int i = 1; i < 10; i++){
            result = num*i;
            System.out.println(String.format("%s x %s = %s", num, i, result));
        }
    }
    //конвертер валют
    public static void currencyExchange(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму в $ :");
        double amountInDollars = in.nextDouble();
        double exchangeRate = 12500;
        double amountInSom = amountInDollars * exchangeRate;
        System.out.println(String.format("%s $ = %s сум", amountInDollars, amountInSom));
    }
    //чётное или нечётное
    public static void isOddOrEven(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        String answer = (num%2 == 0) ? "Число чётное": "Число нечётное";
        System.out.println(answer);
    }
    //максимум из трёх
    public static void getMaxValue(){
        Scanner in = new Scanner(System.in);
        int size = 3;
        int nums[] = new int[size];
        System.out.println("Введите числа: ");
        for(int i = 0; i < size; i++){
            nums[i] = in.nextInt();
        }
        int max = nums[0];
        for(int i = 1; i < size; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println(String.format("Максимальное из введённых чисел : %s", max));
    }
    //калькулятор
    public static void calculator(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = in.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = in.nextDouble();
        System.out.println("Введите операцию, которую хотели бы выполнить над ними: +,-,*,/");
        char operation = in.next().charAt(0);
        double result = 0;
        switch (operation){
            case '+': result = num1 + num2;
            case '-': result = num1 - num2;
            case '*': result = num1 * num2;
            case '/': result = num1 / num2;
        }
        System.out.println(String.format("%s %s %s = %s", num1, operation, num2, result));
    }
    //среднее арифметическое
    public static void arithmeticMean(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = in.nextInt();
        double nums[] = new double[n];
        double result = 0;
        for(int i = 0; i < n; i++){
            System.out.println(String.format("Введите %s число: ", i+1));
            nums[i] = in.nextDouble();
        }
        for (int i = 0; i < n; i++){
            result += nums[i];
        }
        result /= n;
        System.out.println(String.format("Среднее арифметическое равно: %s",result));
    }
    //поиск элемента в массиве
    public static void isInArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве:");
        int n = in.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println(String.format("Введите %s элемент массива: ", i+1));
            nums[i] = in.nextInt();
        }
        System.out.println("Введите искомое число: ");
        int requiredNum = in.nextInt();

    }
}

