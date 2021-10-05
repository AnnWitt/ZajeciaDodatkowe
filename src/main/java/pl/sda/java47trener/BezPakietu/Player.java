package pl.sda.java47trener.BezPakietu;

public class Player {

    private int health;
    private int strength;
    int hpStart;

    Player (int initialHealh, int initialStrengh) {
        this.health=initialHealh;
        this.strength=initialStrengh;
        setHpStart(this.health); //można bez

    }

    void showHealth() {
        System.out.println("Player health " + health + " HP " + ((float)health/getHpStart())*100+ " %" ); //aby pokazywal %
    }


    boolean areYouAlive(){
        return health>0;
    }




    //getter setter

    private int getHpStart() {
        return hpStart;
    }

    private void setHpStart(int hpStart) {
        this.hpStart = hpStart;
    }

    public int getHealth() {
        return health;
    }

    void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public int getStrength() {
        return strength;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }
}
