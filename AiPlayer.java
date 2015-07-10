import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Роман on 09.07.2015.
 */
public class AiPlayer extends Player {

    boolean difficultAI;

    public AiPlayer(String symbol, boolean difficultAI){
        this.symbol = symbol;
        this.difficultAI = difficultAI;
    }

    @Override
    public void makeMove(Cell[][] cells, ArrayList<String> freeCells){

        if(difficultAI){
            makeMoveDiff(cells, freeCells);
        }else {
            makeMoveEasy(cells, freeCells);
        }

    }

    private void makeMoveDiff(Cell[][] cells, ArrayList<String> freeCells){

    }

    private void makeMoveEasy(Cell[][] cells, ArrayList<String> freeCells){

        while (true){

            int maxFreeCells = freeCells.size() - 1;

            Random rand = new Random();
            int randIndex = rand.nextInt(maxFreeCells);

            int[] xy = this.getXY(Integer.valueOf(freeCells.get(randIndex)) - 1);
            int x = xy[0];
            int y = xy[1];

            if (gameMaster.checkEmptyCell(cells[x][y])) {
                cells[x][y].setSymbol(this.getSymbol());
                freeCells.remove(randIndex);
                break;
            } else {
                printerConsole.wrongMove();
            }

        }
    }
}
