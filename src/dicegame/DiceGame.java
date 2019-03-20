package dicegame;

public class DiceGame {

    public static void main(String[] args) {

        Game game = new Game();
        
        Player player = new PlayerComp("Van");
                
        game.addPlayer(player);
        game.addPlayer(new PlayerComp("SAR"));
                       
        game.removePlayer("SAR");
        
        game.printPlayers();
        
        game.play();
    }
    
}
