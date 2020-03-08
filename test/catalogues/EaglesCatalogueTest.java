package catalogues;

import colours.EagleColour;
import creature.Eagle;
import offspring.Egg;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EaglesCatalogueTest {

    private static EaglesCatalogue catalogue;

    @BeforeClass
    public static void init() {
        catalogue = new EaglesCatalogue();

        EaglesCatalogue.addEagle(new Eagle("Artemis", 8, EagleColour.BLACK, 8));
        EaglesCatalogue.addEagle(new Eagle("Ariadne", 13, EagleColour.BROWN, 17));
        EaglesCatalogue.addEagle(new Eagle("Ambert", 16, EagleColour.WHITE, 32));
    }

    @Test
    public void getEldest() {
        Eagle eagle = new Eagle("Ambert", 16, EagleColour.WHITE, 32);

        Eagle eagle1 = catalogue.getEldest();

        assertTrue(eagle.equals(eagle1));
    }

    @Test
    public void maxWingsSpread() {

        int result = catalogue.maxWingsSpread();

        assertEquals(result, 32);
    }

    @Test
    public void longestEagleName() {

        int result = catalogue.longestEagleName();

        assertEquals(result, 7);
    }

    @Test
    public void newList() {
        Eagle artemis = new Eagle("Artemis", 8, EagleColour.BLACK, 8);
        List<Eagle> list = new ArrayList<>();
        list.add(artemis);

        List<Eagle> eagles = catalogue.newList("black");

        assertEquals(list, eagles);
    }

    @Test
    public void newListNames() {
        List<String> list = new ArrayList<>();
        list.add("Artemis");
        list.add("Ariadne");
        list.add("Ambert");

        List<String> names = catalogue.newListNames();

        assertEquals(list, names);
    }

    @Test
    public void newListColours() {
        List<String> list = new ArrayList<>();
        list.add("BLACK");
        list.add("BROWN");
        list.add("WHITE");

        List<String> colours = catalogue.newListColours();

        assertEquals(list, colours);
    }

    @Test
    public void naturalOrder() {
        Eagle artemis = new Eagle("Artemis", 8, EagleColour.BLACK, 8);
        Eagle ariadne = new Eagle("Ariadne", 13, EagleColour.BROWN, 17);
        Eagle ambert = new Eagle("Ambert", 16, EagleColour.WHITE, 32);
        List<Eagle> list = new ArrayList<>();
        list.add(artemis);
        list.add(ambert);
        list.add(ariadne);

        List<Eagle> eagles = catalogue.naturalOrder();

        assertEquals(list, eagles);
    }

    @Test
    public void sortedAge() {
        Eagle artemis = new Eagle("Artemis", 8, EagleColour.BLACK, 8);
        Eagle ariadne = new Eagle("Ariadne", 13, EagleColour.BROWN, 17);
        Eagle ambert = new Eagle("Ambert", 16, EagleColour.WHITE, 32);
        List<Eagle> list = new ArrayList<>();
        list.add(artemis);
        list.add(ariadne);
        list.add(ambert);

        List<Eagle> eagles = catalogue.sortedAge();

        assertEquals(list, eagles);
    }

    @Test
    public void olderThan() {

        boolean result = catalogue.olderThan(33);

        assertEquals(result, false);
    }

    @Test
    public void colourMatch() {

        boolean result = catalogue.colourMatch("brown");

        assertEquals(result, true);
    }

    @Test
    public void createEgg() {
        Eagle artemis = new Eagle("Artemis", 8, EagleColour.BLACK, 8);
        Eagle ariadne = new Eagle("Ariadne", 13, EagleColour.BROWN, 17);
        Eagle ambert = new Eagle("Ambert", 16, EagleColour.WHITE, 32);

        List<Egg> list = new ArrayList<>();
        Egg black = new Egg(artemis);
        Egg brown = new Egg(ariadne);
        Egg white = new Egg(ambert);
        list.add(black);
        list.add(brown);
        list.add(white);

        List<Egg> eggs = catalogue.createEgg();

        assertEquals(list, eggs);
    }

    @Test
    public void createEggIfWingsSpread() {
        Eagle ambert = new Eagle("Ambert", 16, EagleColour.WHITE, 32);

        List<Egg> list = new ArrayList<>();
        Egg white = new Egg(ambert);
        list.add(white);

        List<Egg> eggs = catalogue.createEggIfWingsSpread(30);

        assertEquals(list, eggs);
    }
}