package edu.macalester.comp124.life;

public class HighLife implements RuleSet {

    public String getName() {
        return "Highlife Rules";
    }

    public boolean applyRules(boolean isAlive, int neighborCount) {
        if (isAlive){
            if (neighborCount < 2 || neighborCount > 3){
                return false;
            }
            else {
                return true;
            }
        }
        else if (!isAlive){
            if (neighborCount == 3 || neighborCount == 6){
                return true;
            }
            else {
                return false;
            }
        }
        return true;
    }
}