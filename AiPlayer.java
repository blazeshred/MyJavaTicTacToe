import java.util.ArrayList;

/**
 * Created by ����� on 09.07.2015.
 */
public class AiPlayer extends Player {

    boolean difficultAI;

    public AiPlayer(String symbol, boolean difficultAI){
        this.symbol = symbol;
        this.difficultAI = difficultAI;
    }

    @Override
    public void makeMove(Cell[][] cells, ArrayList<String> freeCells){

    }
}
