package instuments;

public abstract class Intrument {
    private String colour;
    private String type;

    public Intrument(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}
