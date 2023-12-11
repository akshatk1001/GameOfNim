public class ExpertAI {

    public void makeMove(){
        int amountToRemove;
        int pileSize = playGame.board.pileSize;
        int maxRemovable = playGame.board.maxRemovable();

        
        if (pileSize == 2) {
            amountToRemove = 1; 
        } 
        else {
            amountToRemove = (pileSize - 2) % (maxRemovable + 1);
            if (amountToRemove == 0 || amountToRemove > maxRemovable) {
                amountToRemove = 1 + (int)(Math.random() * maxRemovable);
            }
        }
        System.out.println(" ");
        System.out.println("There are " + playGame.board.pileSize + " sticks currently.");
        System.out.println("ExpertAI removes " + amountToRemove + " sticks!");
        playGame.board.pileSize -= amountToRemove;
    }
}