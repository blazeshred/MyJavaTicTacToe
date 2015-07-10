import java.util.ArrayList;

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

    }
}
