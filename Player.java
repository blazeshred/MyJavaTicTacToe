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

    public int[] getXY(int position){
        int[] xy = new int[2];
        int x = position/3;
        xy[0]=x;
        xy[1] = position - x*3;
        return xy;
    }

    public abstract void makeMove(Cell[][] cells, ArrayList<String> freeCells);

}
