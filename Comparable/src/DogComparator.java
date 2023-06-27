import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        int difNames = dog1.getName().compareTo(dog2.getName());
        int difAges = dog1.getAge() - dog2.getAge();
        int difHeights = (int) (dog1.getHeight() - dog2.getHeight());
        int difBreeds = dog1.getDogBread().toString().compareTo(dog2.getDogBread().toString());

        if (difBreeds != 0) {
            return difBreeds;
        }
        if (difAges != 0) {
            return difAges;
        }
        if (difHeights != 0) {
            return difHeights;
        }
        return difNames;
    }
}
