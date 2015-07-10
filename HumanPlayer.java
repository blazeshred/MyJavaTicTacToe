import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Created by Роман on 09.07.2015.
 */
public class HumanPlayer extends Player {

    public HumanPlayer(String symbol){
        this.symbol = symbol;
    }

    @Override
    public void makeMove(Cell[][] cells, ArrayList<String> freeCells){

        int x,y;
        int answer = 0;

        while (true) {

            while (true) {
                printerConsole.pressX();

                try {
                    answer = in.nextInt();
                } catch  (InputMismatchException e) {
                    System.out.println("Input ERROR");
                    in.next();
                }

                if (answer == 1) {
                    x = 0;
                    break;
                } else if (answer == 2) {
                    x = 1;
                    break;
                } else if (answer == 3) {
                    x = 2;
                    break;
                } else {
                    printerConsole.must123();
                }
            }

            while (true) {
                printerConsole.pressY();
                try {
                    answer = in.nextInt();
                } catch  (InputMismatchException e) {
                    System.out.println("Input ERROR");
                    in.next();
                }
                if (answer == 1) {
                    y = 0;
                    break;
                } else if (answer == 2) {
                    y = 1;
                    break;
                } else if (answer == 3) {
                    y = 2;
                    break;
                } else {
                    printerConsole.must123();
                }
            }

            if (gameMaster.checkEmptyCell(cells[x][y])) {
                cells[x][y].setSymbol(this.getSymbol());
                freeCells.remove(getNumberForArray(x,y));
                break;
            }else{
                printerConsole.wrongMove();
            }

        }


    }

}
