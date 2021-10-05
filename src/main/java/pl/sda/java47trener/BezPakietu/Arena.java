package pl.sda.java47trener.BezPakietu;

public class Arena {

    Player player;
    Monster enemy;

    // nextTurn()
    // player attacks monster
    // monster attacks player
    // if killed then done

    void nextTurn() {
        //while(player.getHealth() > 0 && enemy.health > 0) { //zastapic <0 czyms innym
       // while(isLife(player.getHealth(), enemy.getHealth())) { //zabrane z innej metody
        //shouldfightcontinue
        while(player.areYouAlive() && enemy.isItAlive()) { //zabrane z innej metody //boolean souldFightContinue()
            player.showHealth();
            //System.out.println("Player: " + player.getHealth() + "HP");
            //System.out.println("Enemy: " + enemy.getHealth() + "HP");
            enemy.showHealth();

            int newPlayerHealth=player.getHealth()-enemy.getStrength();
            int newMonsterHealth=enemy.getHealth()-player.getStrength();
            player.setHealth(newPlayerHealth);
            enemy.setHealth(newMonsterHealth);

            //gettery settery dla monster

        }

        System.out.println("Walka zakończona!");
        //System.out.println("Player: " + player.getHealth() + "HP");
        //System.out.println("Enemy: " + enemy.getHealth() + "HP");


    }

    boolean souldFightContinue() {
        return player.areYouAlive() && enemy.isItAlive();
    }

    private boolean isLife(int playerHealth, int enemyHealth) {
        if (playerHealth>0 && enemyHealth>0) {
            return true;
        } else {
            return false;
        }
    }


    //

}
