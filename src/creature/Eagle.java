package creature;

import colours.EagleColour;

/**
 * Application Eagle class.
 *
 * @author Karol Mickiewicz
 */
public class Eagle implements Comparable<Eagle> {

    private String name;
    private int age;
    private EagleColour eagleColour;
    private int wingsSpread;

    public Eagle(String name, int age, EagleColour eagleColour, int wingsSpread) {
        this.name = name;
        this.age = age;
        this.eagleColour = eagleColour;
        this.wingsSpread = wingsSpread;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EagleColour getEagleColour() {
        return eagleColour;
    }

    public int getWingsSpread() {
        return wingsSpread;
    }

    @Override
    public int compareTo(Eagle o) {

        int result = eagleColour.compareTo(o.eagleColour);
        if (result == 0) {
            result = age - o.age;
        }
        if (result == 0) {
            result = wingsSpread - o.wingsSpread;
        }
        if (result == 0) {
            result = name.compareTo(o.name);
        }
        return result;

    }

    @Override
    public String toString() {
        return "Eagle{" + "name= " + "'" + name + "'" + ", age= " + "'" + age + "'" + ", colour= " + "'"
                + getEagleColour().getColour() + "'" + ", WingsSpred= " + "'" + wingsSpread + "'" + "}";
    }

}
