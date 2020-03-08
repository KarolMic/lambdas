package offspring;

import colours.EagleColour;
import creature.Eagle;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Egg egg = (Egg) o;
        return eagleColour == egg.eagleColour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eagleColour);
    }
}
