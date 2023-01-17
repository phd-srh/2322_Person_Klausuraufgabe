public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mr. X", 17);
        Person p2 = new Person("Mr. S", 42);

        System.out.println("Name: " + p1.getName() + ", " +
                p1.getPersonalnummer());
        System.out.println("Name: " + p2.getName() + ", " +
                p2.getPersonalnummer());
    }
}
