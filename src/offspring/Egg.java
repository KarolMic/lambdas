package offspring;

import colours.EagleColour;
import creature.Eagle;

/**
 * Application Egg class.
 *
 * @author Karol Mickiewicz
 */
public class Egg {

    private EagleColour eagleColour;

    public Egg(Eagle eagle) {
        this.eagleColour = eagle.getEagleColour();
    }

    @Override
    public String toString() {
        return "Egg colour= " + eagleColour;
    }
}
