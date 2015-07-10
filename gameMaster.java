import java.util.ArrayList;

/**
 * Created by Роман on 09.07.2015.
 */
public class gameMaster {

    public static Player switchPlayer(Player activePlayer, Player player1, Player player2){
        if(activePlayer.equals(player1)){
            return player2;
        }else {
            return player1;
        }
    }

    public static boolean checkWinner(String symbol, Cell[][] cells){
        boolean HaveWinner = false;

        HaveWinner = checkRaws(symbol, cells);
        HaveWinner = !HaveWinner && checkColum(symbol, cells);
        HaveWinner = !HaveWinner && checkDiagonal(symbol, cells);

        return HaveWinner;
    }

    public static boolean noWinner(ArrayList<String> freeCells){
        return freeCells.isEmpty();
    }

    public static boolean checkEmptyCell(Cell cell){
        return(cell.getSymbol()==" ");


    }

    private static boolean checkRaws(String symbol, Cell[][] cells) {

        for (Cell[] raws : cells) {
            int num = 0;
            for (Cell colum : raws) {
                if (colum.getSymbol() == symbol) {
                    num++;
                    if (num == 3) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    private static boolean checkColum(String symbol, Cell[][] cells) {

        for (int j = 0; j<0; j++) {
            int num = 0;
            for (int i = 0; i<0; i++) {
                if (cells[i][j].getSymbol() == symbol) {
                    num++;
                    if (num == 3) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    private static boolean checkDiagonal(String symbol, Cell[][] cells) {

        int num = 0;
        for(int i=0;i<3;i++){
            if (cells[i][i].getSymbol() == symbol) {
                num++;
                if (num == 3) {
                    return true;
                }
            }
        }

        num = 0;
        for(int i=0;i<3;i++){
            for(int j=2; j>-1;j--) {
                if (cells[i][j].getSymbol() == symbol) {
                    num++;
                    if (num == 3) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

}
