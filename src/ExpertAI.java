public class ExpertAI {

    public void makeMove() {
        int amountToRemove;
        int pileSize = playGame.board.pileSize;
        int maxRemovable = playGame.board.maxRemovable();
        int optimalRemaining = pileSize % (maxRemovable + 1);
        amountToRemove = optimalRemaining == 0 ? maxRemovable : optimalRemaining - 1;

        if (amountToRemove <= 0 || amountToRemove > maxRemovable) {
            amountToRemove = 1;  // Default to removing one if the calculation doesn't give a valid number
        }
        
        System.out.println(" ");
        System.out.println("There are " + playGame.board.pileSize + " sticks currently.");
        System.out.println("ExpertAI removes " + amountToRemove + " sticks!");
        playGame.board.pileSize -= amountToRemove;
    }
}
