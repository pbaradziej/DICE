package dicegame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {

    protected List<Player> players = new ArrayList();
            
    protected Random rand = new Random();     //obiekt losujący
            
    public void addPlayer(Player player) {
        if (player != null) {
            
            if (!nameExists(player.getName())) {
                players.add(player);
            } else {
                player.setName(player.getName() + rand.nextInt(10));
                addPlayer(player);
            }            
        } else {
            throw new IllegalArgumentException("Gracz nie może być null.");
        }
    }
    
    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     */
    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    public void removePlayer(String name) {

        for (Iterator<Player> it = players.iterator() ; it.hasNext(); ) {
            Player player = it.next();
            if (player.getName().equals(name)) {
                it.remove();
                break;
            }
        }
        
    }
    
    public void play() {
        int number,                     //wylosowana
            guess;                      //gracz
        
        boolean oneMore;
        
        do {
            oneMore = true;
            
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : players) {
                guess = player.guess();

                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    oneMore = false;
                    System.out.println("BRAWO!");
                }            
            }
        
        } while (oneMore);

    }
    
}
