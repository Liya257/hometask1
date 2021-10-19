import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//доработку искуственного интеллекта взяла из разбора дз, скорректировала некоторые моменты с проверкой символов на выйгрыш
public class TicTacToe {

    public static final String AI_WIN_MSG = "Победил компьютер!";
    public static final String HUMAN_WIN_MSG = "Победил человек!";
    public static final String DRAW_MSG = "Ничья!";
    private static final int SIZE = 3;
    private static final int DOTS_TO_WIN = 3;
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '•';

    private static final char[][] MAP = new char[SIZE][SIZE];
    private static final Scanner SCANNER = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        startGameLoap();
    }

    private static boolean checkRC(char symbol){
        for (int i = 0; i < SIZE; i++) {
            int rowValue = 0, colValue = 0;
            for (int j = 0; j < SIZE; j++) {
                rowValue = (MAP[i][j] == symbol) ? rowValue + 1 : 0;
                colValue = (MAP[j][i] == symbol) ? colValue + 1 : 0;
                if(rowValue == DOTS_TO_WIN || colValue == DOTS_TO_WIN){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiag(char symbol){
        int generalDiagValue = 0, sideDiagValue = 0;
        for (int i = 0; i < SIZE; i++) {
            generalDiagValue = (MAP[i][i] == symbol) ? generalDiagValue + 1 : 0;
            sideDiagValue = (MAP[i][MAP.length - 1 - i] == symbol) ? sideDiagValue + 1 : 0;
            if(generalDiagValue == DOTS_TO_WIN || sideDiagValue == DOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }

    private static void startGameLoap() {
        while (true) {

            humanTurn();
            printMap();

            if(checkEndGame(DOT_X)){
                break;
            }
            aiTurn();
            printMap();
            if (checkEndGame(DOT_O)) {
                break;
            }
        }
    }

    private static boolean checkEndGame(char symbol) {
        if(isMapFull()){
            System.out.println(DRAW_MSG);
            return true;
        }
        if(isWin(symbol)){
            System.out.println(getWinMessageBy(symbol));
            return true;
        }
        return false;
    }

    private static String getWinMessageBy(char symbol){
        return symbol == DOT_X ? HUMAN_WIN_MSG : AI_WIN_MSG;
    }

    private static boolean isWin(char symbol){

        /*for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == map[i][j+1]) {
                    System.out.println("Win!");
                    break;
                }if(map[i][j] == map[i+1][j]){
                    System.out.println("Win!");
                    break;
                }if (map[i][j] == map[i+1][j+1]){
                    System.out.println("Win!");
                    break;
                }if (map[SIZE-i][SIZE-j] == map[SIZE-i-1][SIZE-j-1]){
                    System.out.println("Win!");
                    break;
                }

            }
        }*/
        //rows
        /*for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE; j++) {
                if(MAP[i][j] == symbol && (MAP[i][j+1] == symbol || MAP[i+1][j] == symbol)){
                        return true;
                }if(MAP[i][j] == symbol && (MAP[i+1][j] == symbol || MAP[i][j+1] == symbol)){
                        return true;
                }if(MAP[i][j] == symbol && (MAP[i+1][j+1] ==symbol || MAP[i][j+2] == symbol)){
                    return true;
                }
            }

        }*/
        /*if(MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) return true;
        if(MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) return true;
        if(MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) return true;*/
        //cols
        /*if(MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) return true;
        if(MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) return true;
        if(MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) return true;*/

        //diagonals
        /*if(MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[0][2] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return true;*/

        return checkRC(symbol) || checkDiag(symbol);
    }

    private static boolean isMapFull(){
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if(isEmptyCell(row, col)){
                    return false;
                }
            }
        }
        return  true;
    }

    private static void initMap() {
        for (int rowIndex = 0; rowIndex < MAP.length; rowIndex++) {
            Arrays.fill(MAP[rowIndex], DOT_EMPTY);
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapState();
        System.out.println();
    }

    private static int[] getRandomEmptyCell(){
        int row, col;
        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (isEmptyCell(row,col));
        return new int[]{row,col};
    }

    private static void aiTurn() {
        int[] cell = getNextCellToWin(DOT_X);
        if(cell == null){
            cell = getNextCellToWin(DOT_O);
            if(cell == null){
                cell = getRandomEmptyCell();
            }
        }
        int row = cell[0];
        int col = cell[1];
        MAP[row][col] = DOT_X;
    }
    private static boolean isGameMoveWinning(int row, int col, char symbol){
        MAP[row][col] = symbol;
        boolean result = isWin(symbol);
        MAP[row][col] = DOT_EMPTY;
        return result;
    }
    private static int[] getNextCellToWin(char symbol){
        for(int row = 0; row < MAP.length; row++){
            for (int col = 0; col < MAP[row].length; col++) {
                if(MAP[row][col] == DOT_EMPTY && isGameMoveWinning(row, col, symbol)){
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    private static void humanTurn() {
        System.out.println("Введите координаты row col: ");
        int row = 0;
        int col = 0;
        do {
            row = readIndex();
            col = readIndex();

            if (!checkRange(row) || !checkRange(col)) {

                System.out.println("Координаты должны быть в диапазоне от 1 до " + SIZE);
                continue;
            }

            if(isEmptyCell(row - 1, col - 1)){
                break;
            } else {
                System.out.println("Эта клетка уже занята!");
            }
        } while (true);

        MAP[row - 1][col - 1] = DOT_X;
    }

    private static boolean isEmptyCell(int row, int col){
        return MAP[row][col] == DOT_EMPTY;
    }

    private static int readIndex() {
        while (!SCANNER.hasNextInt()){
            System.out.println("Координаты должны иметь целочисленное значение!");
            SCANNER.next();
        }
        return SCANNER.nextInt();
    }


    private static boolean checkRange(int index) {
        return index >= 1 && index <= SIZE;
    }


    private static void printMapState() {
        for (int rowIndex = 0; rowIndex < MAP.length; rowIndex++){
            printRowNumber(rowIndex + 1);
            printRow(MAP[rowIndex]);
            System.out.println();
        }
    }

    private static void printRow(char[] chars) {
        for (int colIndex = 0; colIndex < chars.length; colIndex++) {
            System.out.print(chars[colIndex] + " ");
        }
    }

    private static void printRowNumber(int rowNumber) {
        System.out.print((rowNumber) + " ");
    }

    private static void printMapHeader() {
        for (int colIndex = 0; colIndex <= SIZE; colIndex++) {
            System.out.print(colIndex + " ");
        }
        System.out.println();
    }
}
