package pl.sda.java47trener.BezPakietu;

public class FightApp {

    public static void main(String[] args) {

        System.out.println("Witaj na arenie!");

        Arena arena = new Arena();
        Player p1 = new Player(100,15);
        Monster m = new Monster(25,50);

        arena.player = p1;
        arena.enemy = m;

        arena.nextTurn();
    }

}
