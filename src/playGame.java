import java.util.Scanner; 

public class playGame {
    public static Board board = new Board();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Would you like to play multiplayer or vs AI?: ");
        String choice = scanner.nextLine();

        if (choice.equals("multiplayer")){
            Player player1 = new Player("Player 1");
            Player player2 = new Player("Player 2");
            player1.getName();
            player2.getName();     
            while (board.pileSize != 1) {
                player1.getPlayerMove();
                if (board.pileSize == 1){
                    System.out.println(" ");
                    System.out.println(player1.name + " WINS!!!!");
                    break;
                }
                player2.getPlayerMove();
                if (board.pileSize == 1){
                    System.out.println(" ");
                    System.out.println(player2.name + " WINS!!!!");
                    break;
                }
            }        
        }
    }
    }


