package ch.csbe.modul404.constructor;

public class Pokemon {
    private String name;
    private String type;

    public Pokemon(String name, String type) {
        // String[] colors = {"White", "Blue"};
        // String mainColor = colors[1];
        // String secondaryColor = colors[0];
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
