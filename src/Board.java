public class Board {
    public static int pileSize;
    
    private void createSticks(){
        pileSize = 20 + (int)(Math.random() * 31);
    }

    private void removeSticks(int number){
        pileSize -= number;
    }

    public static void main(String[] args){
        Board board = new Board();
        board.createSticks();
        System.out.println(pileSize);
    }

}
