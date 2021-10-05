package pl.sda.java47trener.MetodyPakietowe.fighters;

public class Stats {

    public void showPlayerStats(Player player) {
        System.out.println("Pokaz statystyki graczya ");
        player.showHealth();
        System.out.println("siła gracza " + player.getStrength());
        System.out.println("czy zywy " + (player.areYouAlive() ? "Tak" : "Nie")); //mozna metoda: boolen? co jesli tak co jestli nie

    }

    public void showMonsterStats(Monster monster) {
        System.out.println("Pokaz statystyki potwora ");
        monster.showHealth();
        System.out.println("siła gracza " + monster.getStrength());
        System.out.println("czy zywy " + (monster.isItAlive() ? "Tak" : "Nie")); //mozna metoda: boolen? co jesli tak co jestli nie

    }
}
