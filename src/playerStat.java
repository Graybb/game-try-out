public class playerStat {
    private int strength;
    private int intelligence;
    private int dexterity;
    private StatCalculator STC = new StatCalculator();
    public playerStat(int strength, int intelligence, int dexterity) {
        setDexterity(dexterity);
        setIntelligence(intelligence);
        setStrength(strength);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getSpellDmgMod() {
        return STC.getSpellMod(intelligence);
    }

    public int getSpeed() {
        return STC.GetSpeed(dexterity,strength);
    }
    public int getPhysicalMod() {
        return STC.getPhysicalMod(strength);
    }
}
