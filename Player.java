import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Роман on 09.07.2015.
 */
public abstract class Player {

    protected String symbol;
    protected Scanner in = new Scanner(System.in);

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNumberForArray(int x, int y){

        return Integer.toString((x*3+y+1));

    }

    public abstract void makeMove(Cell[][] cells, ArrayList<String> freeCells);

}
