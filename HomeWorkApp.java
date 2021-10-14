import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        mas1();
        mas2();
        mas3();
        mas4();
        mas5(5,3);
        mas6();
    }
    public static void mas1() {
        System.out.println("Mas1(); - started!");
        int[] a= new int[] {1,1,0,0,1,0,1,1,0,0,};
        for (int j : a) {//сокращеная версия цикла
            if(j == 1){
                j = 0;
            }else
                j = 1;
            System.out.println(j);
        }
    }

    public static void mas2(){
        System.out.println("Mas2(); - started!");
        int[] b = new int[100];
        for(int j = 0 , k = 100; j < b.length; j++, k--){
                b[j]=k;
                System.out.println(b[j]);
        }

    }
    public static void mas3(){
        System.out.println("mas3(); - started!");
     int[] array = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};
     for(int i = 0; i < array.length; i++){
         if(array[i] < 6){
             array[i] = array[i]*2;
             System.out.println(array[i]);
         }else
             System.out.println(array[i]);
       // System.out.println(array[i]);

     }
    }
    public static void mas4(){

        System.out.println("mas4(); - started!");
        int[][] arr = new int[4][4];
        for(int i = 0; i < arr.length; i++){// главная диагональ
            for(int j = 0; j < arr.length; j++){
                if (i == j){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++ ){//главаня и побочная диагонали
            for(int j = 0; j < arr.length ; j++){
                //int k = arr.length;
                if (j == arr.length-1-i){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void mas5(int len, int initialValue){
        System.out.println("mas5(); - started!");//заполнили массив состоящий из 5 элементов значениями 3.
        int[] k = new int[len];
        for(int i= 0; i < k.length; i++){
            k[i] = initialValue;
            System.out.print(k[i]);
        }
        System.out.println();
    }
    public static void mas6(){
        System.out.println("mas6(); - started!");
        int[] arr = new int[]{1,18,22,15,2,6,99,14};
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        System.out.println("Max value of array: " + max );
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min value of array: " + min);
    }
    public static void mas7(){

    }
       /* System.out.println(sum(11, 22));
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
    }*/
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
