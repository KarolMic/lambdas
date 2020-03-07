package colours;

/**
 * Application EagleColour class.
 *
 * @author Karol Mickiewicz
 */
public enum EagleColour {

    GREY("grey"),
    BLACK("black"),
    WHITE("white"),
    BROWN("brown");

    private final String colour;

    EagleColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

}
