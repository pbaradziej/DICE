package dicegame;

public abstract class Player {
       
    private String name = "Domyślny Janusz";
       
    public Player() {}
    
    public Player(String name) {
        setName(name);
    }

    public abstract int guess();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z][a-zA-Z0-9@\\-_.]{2,29}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imię.");
        }
    }
    
}
