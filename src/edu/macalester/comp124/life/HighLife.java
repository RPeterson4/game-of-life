package edu.macalester.comp124.life;

public class HighLife implements RuleSet {

    public String getName() {
        return "HighLife Rules";
    }

    public boolean applyRules(boolean isAlive, int neighborCount) {
        if (isAlive){
            return(neighborCount == 2 || neighborCount == 3);
        } else
            return (neighborCount == 3 || neighborCount == 6);
    }
}