public class Dog {
    private String name;
    private int age;
    private double height;
    private final DogBread dogBread;

    public Dog(String name, int age, double height, DogBread dogBread) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.dogBread = dogBread;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public DogBread getDogBread() {
        return dogBread;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", dogBread=" + dogBread +
                '}';
    }
}
