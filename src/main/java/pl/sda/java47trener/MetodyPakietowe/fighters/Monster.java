package pl.sda.java47trener.MetodyPakietowe.fighters;

public class Monster {

    private int health;// = 50;
    private int strength;// = 25;
    private int hpStart; //final, bedzie niemozliwa do zmiany - mozna tu lub w konstruktorze


    public Monster(int inicialHealth, int inicialStrengh) { //bo tworzymy poza pakietem
        this.health = inicialHealth;
        this.strength = inicialStrengh;
        setHpStart(this.health); //można bez
    }

    public void attack(Player player) { //bo arena uzywa a ona poza pakietem
        player.TakeDmg(strength); //sila gracza
    }

     void TakeDmg(int damage) {
        int newHealth = getHealth() - damage;
        setHealth(newHealth);
    } //to tylko miedzy potworem a graczem

    public boolean isItAlive() {
        return health > 0;
    }

    public void showHealth() {
        System.out.println("Monster health " + health + " HP " + ((float) health / getHpStart()) * 100 + " %"); //aby pokazywal %
    }

    private int getHpStart() {
        return hpStart;
    }

    private void setHpStart(int hpStart) {
        this.hpStart = hpStart;
    }

    private int getHealth() {
        return health;
    }

    private void setHealth(int newHealth) {
        this.health = newHealth;
    }

     int getStrength() {
        return strength;
    } //pakietowy - nie musi byc publiuc

    void setStrength(int strength) {
        this.strength = strength;
    }
}
