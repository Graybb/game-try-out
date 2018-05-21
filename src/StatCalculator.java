public class StatCalculator {
public int GetSpeed(int dex, int str) {
    return 100+(dex/2 + str/4);
}

public int getSpellMod(int intelligence) {
    return intelligence*4;
}

public int getPhysicalMod(int str) {
    return str*2;
}


}
