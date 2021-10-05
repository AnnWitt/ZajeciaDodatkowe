package pl.sda.java47trener.BezPakietu;

public class Monster {

    int health;// = 50;
    int strength;// = 25;
    int hpStart; //final, bedzie niemozliwa do zmiany - mozna tu lub w konstruktorze



    Monster(int inicialHealth, int inicialStrengh) {
        this.health=inicialHealth;
        this.strength=inicialStrengh;
        setHpStart(this.health); //można bez
    }

    boolean isItAlive(){
        return health>0;
    }

    void showHealth() {
        System.out.println("Monster health " + health + " HP " + ((float)health/getHpStart())*100+ " %" ); //aby pokazywal %
    }

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
