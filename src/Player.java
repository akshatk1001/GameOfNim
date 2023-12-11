import java.util.Scanner; 

public class Player {
    public String name; 
    public Scanner scanner = new Scanner(System.in);

    public Player(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("What is " + name +"'s name?: ");
        name = scanner.nextLine();
    }

    public void getPlayerMove(){
        int playerMaxRemovable = playGame.board.maxRemovable();
        boolean validInput = false;

        while (!validInput){
            System.out.println(" ");
            System.out.println("There are " + playGame.board.pileSize + " sticks currently.");
            System.out.print(name.toUpperCase() + "'S TURN!!! ");
            System.out.print(name + " can remove at max " + playerMaxRemovable + " sticks.");
            System.out.println(" How many sticks would you like to remove " + name + "?: ");
            int amountToRemove = Integer.parseInt(scanner.nextLine());    
            if (amountToRemove <= playerMaxRemovable){
                playGame.board.pileSize -= amountToRemove;
                validInput = true;
            } 
            else {
                System.out.println("That is over the max you can remove (" + playerMaxRemovable + ").");
            }
        }
    }
}
