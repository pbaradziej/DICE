package dicegame;

import java.util.Random;

public class PlayerComp extends Player {
    
    private final Random rand = new Random(); 

    public PlayerComp() {
    }

    public PlayerComp(String name) {
        super(name);
    }

    @Override
    public int guess() {
        return rand.nextInt(6) + 1;
    }
}
