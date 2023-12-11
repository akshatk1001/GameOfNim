public class Board {
    public int pileSize;
    
    public Board(){
        pileSize = 20 + (int)(Math.random() * 31);
    }

    public int maxRemovable(){
        return ((int) Math.ceil(pileSize / 2.0));
    }

}
