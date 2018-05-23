public class Player {
    private  playerStat ps ;
    private String playerName;
    private LevelCalc lc;
    public Player(String name) {
        playerName = name;
        ps = new playerStat(5,5,5);

    }
    public int attack() {
        return getPhysicalDmgMod();
    }
    public int getPhysicalDmgMod() {
        return ps.getPhysicalMod();
    }
    public int getStr() {
        return ps.getStrength();
    }
    public int getDex() {
        return ps.getDexterity();
    }
    public int getHp() {
        return ps.getHealth();
    }
    public int getIntelligence() {
        return ps.getIntelligence();
    }
    public int getSpell() {
        return ps.getSpellDmgMod();
    }
}
