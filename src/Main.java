import catalogues.EaglesCatalogue;
import colours.EagleColour;
import creature.Eagle;

public class Main {

    public static void main(String[] args) {

        EaglesCatalogue catalogue = new EaglesCatalogue();

        EaglesCatalogue.addEagle(new Eagle("Artemis", 8, EagleColour.BLACK, 8));
        EaglesCatalogue.addEagle(new Eagle("Ariadne", 13, EagleColour.BROWN, 17));
        EaglesCatalogue.addEagle(new Eagle("Ambert", 16, EagleColour.WHITE, 32));

        System.out.println("Print all eagles to standard output: ");
        catalogue.printAll();

        System.out.println("Print names of all eagles: ");
        catalogue.printName();

        System.out.println("Print names and colours of all eagles sorted by eagle name: ");
        catalogue.printSorted();

        System.out.println("Print eldest eagle: ");
        System.out.println(catalogue.getEldest());

        System.out.println("Print the maximum wings spread of all eagles: ");
        System.out.println(catalogue.maxWingsSpread());

        System.out.println("Print number of characters of eagle with longest name: ");
        System.out.println(catalogue.longestEagleName());

        System.out.println("Print list of all eagles with specified colour delivered in the method's parameter");
        System.out.println(catalogue.newList("black"));

        System.out.println("Print new list consisting of only names of all eagles.: ");
        System.out.println(catalogue.newListNames());

        System.out.println("Print new list consisting of only colours of all eagles written in Upper Case: ");
        System.out.println(catalogue.newListColours() );

        System.out.println("Print new list of eagles sorted in natural order: ");
        System.out.println(catalogue.naturalOrder());

        System.out.println("Print new list of eagles sorted by age: ");
        System.out.println(catalogue.sortedAge());

        System.out.println("Print true, when at least one eagle in list of eagles has specified age delivered in the method's parameter: ");
        System.out.println(catalogue.olderThan(7));

        System.out.println("Print true, when at least one eagle in list of eagles has specified colour delivered in the method's parameter: ");
        System.out.println(catalogue.colourMatch("orange"));

        System.out.println("Print new list of eggs created on the basis of the list of eagles.: ");
        System.out.println(catalogue.createEgg());

        System.out.println("Print list of eggs created on the basis of eagles with wings spread greater than number delivered in the method's parameter: ");
        System.out.println(catalogue.createEggIfWingsSpread(16));

    }

}
