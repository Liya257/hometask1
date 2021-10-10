import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(sum(11, 22));
        value(5);
        negative(-5);
        mixed("Homework_2", 5);
        System.out.println(checkYear(2021));
    }
    public static int sum( int a, int b) {
        System.out.println("Start method sum(int a, int b);");
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.print(true);
        } else
            System.out.println(false);
        return a + b;
    }
    public static void value(int d){
        System.out.println("Start method value(int d);");
        if(d >= 0){
            System.out.println("Число положительное");
        }else
            System.out.println("Число отрицательное");
    }

    public static int negative(int p){
        System.out.println("Start method negative(int p);");
        if(p < 0){
            System.out.println("Число отрицательное! - "+ true);
        } else
            System.out.println("Число положительное! - " + false);
        return p;
    }
    public static void mixed(String a, int b){
        System.out.println("Start method mixed(String a, int b);");
        for(int i = 0; i<=b;i++){
            System.out.println(a);
        }
    }
    public static boolean checkYear(int y){
        System.out.println("Start method checkYear(int y);");
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0) ;
    }
    /*
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Start method printThreeWords();");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        System.out.println("Start method checkSumSign();");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = in.nextInt();
        System.out.print("Enter b = ");
        int b = in.nextInt();
        int c = a + b;
        if(c >= 0){
            System.out.println("Сумма положительна.");
        } else System.out.println("Сумма отрицательна.");
    }

    public static void printColor(){
        System.out.println("Start method printColor();");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value = ");
        int value = in.nextInt();
        if(value <= 0 ){
            System.out.println("Red");
        }if(value > 0 && value <= 100){
            System.out.println("Yellow");
        }if(value > 100) System.out.println("Green");
    }
    public static void compareNumbers(){
        System.out.println("Start method compareNumbers();");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = in.nextInt();
        System.out.print("Enter b = ");
        int b = in.nextInt();
        if(a >= b){
            System.out.println("a >= b");
        }if(a < b){
            System.out.println("a < b");
        }
    */


}
