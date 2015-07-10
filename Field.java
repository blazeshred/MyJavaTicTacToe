import java.util.ArrayList;

/**
 * Created by Роман on 09.07.2015.
 */
public class Field {

    private Cell[][] cells;
    private ArrayList<String> freeCells;

    public Field(){

        cells  = new Cell[3][3];
        freeCells = new ArrayList<String>();
        for (int i = 1; i < 10; i++){
            freeCells.add(Integer.toString(i));
        }

        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell();
            }
        }


    }

    public Cell[][] getCells() {
        return cells;
    }

    public ArrayList<String> getFreeCells() {
        return freeCells;
    }
}
