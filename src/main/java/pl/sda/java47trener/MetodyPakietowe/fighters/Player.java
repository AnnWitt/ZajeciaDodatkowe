package pl.sda.java47trener.MetodyPakietowe.fighters;

public class Player {

    private int health;
    private int strength;
    private int hpStart;

    public Player(int initialHealh, int initialStrengh) {
        this.health = initialHealh;
        this.strength = initialStrengh;
        setHpStart(this.health); //można bez

    }

     void TakeDmg(int damage) {
        int newHealth = getHealth() - damage;
        setHealth(newHealth);
    }

    public void attack(Monster monster) { //bo uzywany w arene, musi byc dostepny miedzy pakietami
        monster.TakeDmg(strength); //sila gracza
    }

    public void showHealth() {
        System.out.println("Player health " + health + " HP " + ((float) health / getHpStart()) * 100 + " %"); //aby pokazywal %
    }


    public boolean areYouAlive() {
        return health > 0;
    }


    //getter setter

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
    }

    void setStrength(int strength) {
        this.strength = strength;
    }
}
