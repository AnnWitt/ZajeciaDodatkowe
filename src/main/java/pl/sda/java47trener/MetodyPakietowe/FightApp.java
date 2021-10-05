package pl.sda.java47trener.MetodyPakietowe;


//poki w ramach jednego pakietu to nie trzeba importowac
import pl.sda.java47trener.MetodyPakietowe.arena.Arena;
import pl.sda.java47trener.MetodyPakietowe.fighters.Monster;
import pl.sda.java47trener.MetodyPakietowe.fighters.Player;
import pl.sda.java47trener.MetodyPakietowe.fighters.Stats;

public class FightApp {

    public static void main(String[] args) {

        System.out.println("Witaj na arenie!");

        Arena arena = new Arena();
        Player p1 = new Player(100,15);
        Monster m = new Monster(25,50);

        Stats statistics=new Stats();

        statistics.showPlayerStats(p1);
        statistics.showMonsterStats(m);
        System.out.println();


        arena.player = p1;
        arena.enemy = m;

        arena.nextTurn();

        System.out.println();
        System.out.println("Kolejny gracz");

        System.out.println();
        Player p2 = new Player(10,15);
        Monster m2 = new Monster(25,100);

        statistics.showPlayerStats(p2);
        statistics.showMonsterStats(m2);

        arena.player = p2;
        arena.enemy = m2;

        arena.nextTurn();
    }

}
