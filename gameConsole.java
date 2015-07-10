/**
 * Created by Роман on 09.07.2015.
 */
import java.util.Scanner;
public class gameConsole {

    Field gameField;
    Player player1, player2;
    boolean gameWithAI;
    Scanner in = new Scanner(System.in);

    public gameConsole(){
        gameField = new Field();
        printerConsole.setGameAI();
        String answer;

        while (true) {
            answer = in.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                gameWithAI = true;
                break;
            } else if (answer.equals("n")) {
                gameWithAI = false;
                break;
            } else {
                printerConsole.mustYN();
            }
        }

        player1 = new HumanPlayer("X");

        if (gameWithAI){

            boolean difficultAI;
            printerConsole.setDifficultAI();
            while (true) {
                answer = in.nextLine().trim().toLowerCase();
                if (answer.equals("y")) {
                    difficultAI = true;
                    break;
                } else if (answer.equals("n")) {
                    difficultAI = false;
                    break;
                } else {
                    printerConsole.mustYN();
                }
            }
            player2 = new AiPlayer("O", difficultAI);
            printerConsole.printStartGameWhithAI();
        }else{
            player2 = new HumanPlayer("O");
            printerConsole.printStartGame2Player();
        }
    }

    public void startGame(){

        Player activePlayer = player1;

        while (true){

            printerConsole.whoMove(activePlayer.getSymbol());
            activePlayer.makeMove(gameField.getCells(), gameField.getFreeCells());
            printerConsole.printOutField(gameField.getCells());

            if(gameMaster.checkWinner(activePlayer.getSymbol(), gameField.getCells())){
                printerConsole.printWinner(activePlayer.getSymbol());
                break;
            }

            if(gameMaster.noWinner(gameField.getFreeCells())){
                printerConsole.printNoWinner();
                break;
            }

            activePlayer = gameMaster.switchPlayer(activePlayer, player1, player2);
        }

    }

}
