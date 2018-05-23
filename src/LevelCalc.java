public class LevelCalc {
    public LevelCalc(){
        levelNumber = 1;
        xp = 0;
    }
    public LevelCalc(int level){
        levelNumber = level;
        xp = getXpNeeded();
    }
    private int levelNumber;
    private int xp;
    private int getXpNeeded() {
        return levelNumber*10^levelNumber;
    }
    
}
