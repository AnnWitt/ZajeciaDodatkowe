package pl.sda.java47trener.MetodyPakietowe.arena;

import pl.sda.java47trener.MetodyPakietowe.fighters.Monster;
import pl.sda.java47trener.MetodyPakietowe.fighters.Player;

public class Arena {

    public Player player;
    public Monster enemy;

    // nextTurn()
    // player attacks monster
    // monster attacks player
    // if killed then done

    public void nextTurn() {
        //while(player.getHealth() > 0 && enemy.health > 0) { //zastapic <0 czyms innym
        // while(isLife(player.getHealth(), enemy.getHealth())) { //zabrane z innej metody
        //shouldfightcontinue
        while (player.areYouAlive() && enemy.isItAlive()) { //zabrane z innej metody //boolean souldFightContinue()
            //-->player.showHealth();
            //System.out.println("Player: " + player.getHealth() + "HP");
            //System.out.println("Enemy: " + enemy.getHealth() + "HP");
            //-->enemy.showHealth();

            //int newPlayerHealth = player.getHealth() - enemy.getStrength();
            //int newMonsterHealth = enemy.getHealth() - player.getStrength();
            //player.setHealth(newPlayerHealth);
            //enemy.setHealth(newMonsterHealth);
            player.attack(enemy);
            enemy.attack(player);
            //zrobic dla playera

            //gettery settery dla monster

        }

        System.out.println("Walka zakończona!");
        //zmienic to aby nie pokazywal zdrowie ale na pdostawie tego kto zywy a kto nie kto wygrał
        //player.showHealth();

        //enemy.showHealth();
        //System.out.println("Player: " + player.getHealth() + "HP");
        //System.out.println("Enemy: " + enemy.getHealth() + "HP");

        System.out.println(WynikWalki());


    }

    private String WynikWalki() { // private gdy tylko wewnatrz tej klasy
        String wynik="";
        if (player.areYouAlive() == true ) {
            return "Gracz żyje - gracz wygrał";

        }
        if (enemy.isItAlive() == true) {
            return "Potwór żyje - potwór wygrał";
        }

        if (enemy.isItAlive() != true && player.areYouAlive() != true) {
            return "Obaj zginęli";
        }
        //można if, else if, else - przepisz
        return " ";
    }

    boolean souldFightContinue() {
        return player.areYouAlive() && enemy.isItAlive();
    }

    private boolean isLife(int playerHealth, int enemyHealth) {
        if (playerHealth > 0 && enemyHealth > 0) {
            return true;
        } else {
            return false;
        }
    }


    //

}
