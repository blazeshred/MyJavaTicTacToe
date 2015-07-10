/**
 * Created by Роман on 09.07.2015.
 */
public class printerConsole {

    public static void setGameAI(){
        System.out.println("Игра против AI? y/n");
    }

    public static void mustYN(){
        System.out.println("Необходимо вводить y/n. Поробуйт ещё.");
    }

    public static void must123(){
        System.out.println("Необходимо вводить 1 2 3. Поробуйт ещё.");
    }

    public static void pressX(){
        System.out.println("Введите номер строки:");
    }

    public static void pressY(){
        System.out.println("Введите номер колонки:");
    }

    public static void setDifficultAI(){
        System.out.println("Хотите сыграть с продвинутым AI? y/n");
    }

    public static void whoMove(String symbol){
        System.out.println("Ходит игрок " + symbol);
    }

    public  static void printStartGame2Player(){
        System.out.println("Играют два игрока. Игрок 1 - Х. Игрок 2 - О");
    }

    public  static void printStartGameWhithAI(){
        System.out.println("Игра против AI. Игрок 1 - Х. AI - О");
    }

    public static void printOutField(Cell[][] cells){
        System.out.println();
        for(int i = 0; i < cells.length; i++){

            for(int j = 0; j < cells[i].length; j++){

                System.out.print(cells[i][j].getSymbol());
                if(j<2){
                    System.out.print("|");
                }else {
                    System.out.println();
                }

            }
            if(i<2){
                System.out.println("-----");
            }
        }

    }

    public static void printWinner(String symbol){
        System.out.println("Побидил " + symbol + " !!!");
    }

    public static void printNoWinner(){
        System.out.println("Ничья!!!");
    }

    public static void wrongMove(){
        System.out.println("Не правельный ход, вы ходите на занятую ячейку!");
    }
}
