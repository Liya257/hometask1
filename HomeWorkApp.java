import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
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
    }
}
