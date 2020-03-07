package catalogues;

import creature.Eagle;
import offspring.Egg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class EaglesCatalogue {

    private static List<Eagle> eagles = new ArrayList<>();

    private static Eagle eagle;

    /**
     * Method which allows to add new Eagle to the list of eagles.
     * @param eagle
     */
    public static void addEagle(Eagle eagle) {
        eagles.add(eagle);
    }

    /**
     * Method which allows to remove Eagle from the list of eagles.
     */
    public static void removeEagle() {
        eagles.remove(eagle);
    }

    /**
     * Method which allows to print all eagles to standard output.
     */
    public void printAll() {
        eagles.stream().map(Eagle::toString).forEach(System.out::println);
    }

    /**
     * Method which allows to print names of all eagles.
     */
    public void printName() {
        eagles.stream().map(e -> e.getName()).forEach(System.out::println);
    }

    /**
     * Method which allows to print names and colours of all eagles sorted by eagle name.
     */
    public void printSorted() {
        eagles.stream()
                .sorted(Comparator.comparing(Eagle::getName))
                .forEach(e -> System.out.println(e.getName() + " " + e.getEagleColour()));
    }

    /**
     * Method which returns the eldest eagle.
     */
    public Eagle getEldest() {
        return eagles.stream()
                .sorted(Comparator.comparingInt(Eagle::getAge).reversed())
                .findFirst().orElse(null);
    }

    /**
     * Method which returns the maximum wings spread of all eagles.
     */
    public int maxWingsSpread() {
        return eagles.stream()
                .max(Comparator.comparingInt(Eagle::getWingsSpread)).orElse(null)
                .getWingsSpread();
    }

    /**
     * Method which returns number of characters of eagle with longest name.
     */
    public int longestEagleName() {
        return eagles.stream()
                .sorted(Comparator.comparing(Eagle::getName).reversed())
                .mapToInt(e -> e.getName().length())
                .findFirst().orElse(0);
    }

    /**
     * Method which returns the list of all eagles with specified colour delivered in the method's parameter.
     */
    public List<Eagle> newList(String colour) {
        return eagles.stream().
                filter(e -> e.getEagleColour().getColour().equals(colour))
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

    /**
     * Method which returns new list consisting only names of all eagles.
     */
    public List<String> newListNames() {
        return eagles.stream()
                .map(e -> e.getName())
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

    /**
     * Method which returns new list consisting of only colours of all eagles written in Upper Case.
     */
    public List<String> newListColours() {
        return eagles.stream()
                .map(e -> e.getEagleColour().getColour().toUpperCase())
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

    /**
     * Method which returns new list of eagles sorted in natural order.
     */
    public List<Eagle> naturalOrder() {
        return eagles.stream()
                .sorted()
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

    /**
     * Method which returns new list of eagles sorted by age.
     */
    public List<Eagle> sortedAge() {
        return eagles.stream()
                .sorted(Comparator.comparing(Eagle::getAge))
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

    /**
     * Method which returns true, when at least one eagle in list of eagles has specified age delivered in the method's parameter.
     */
    public boolean olderThan(int age) {
        return eagles.stream()
                .allMatch(e -> e.getAge() > age);
    }

    /**
     * Method which returns true, when at least one eagle in list of eagles has specified colour delivered in the method's parameter.
     */
    public boolean colourMatch(String colour) {
        return eagles.stream()
                .anyMatch(e -> e.getEagleColour().getColour().equals(colour));
    }

    /**
     * Method which returns list of eggs created on the basis of the list of eagles.
     */
    public List<Egg> createEgg() {
        return eagles.stream()
                .map(e -> new Egg(e))
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

    /**
     * Method which returns list of eggs created on the basis of eagles with wings spread is greater than number delivered in the method's parameter.
     * @param wingsSpread
     * @return
     */
    public List<Egg> createEggIfWingsSpread(int wingsSpread) {
        return eagles.stream()
                .filter(e -> e.getWingsSpread() > wingsSpread)
                .map(e -> new Egg(e))
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

}
