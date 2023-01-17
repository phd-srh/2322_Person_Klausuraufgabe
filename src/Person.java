public class Person {
    private String name;
    private int personalnummer;

    public Person(String name, int personalnummer) {
        this.name = name;
        this.personalnummer = personalnummer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalnummer() {
        return this.personalnummer;
    }
}
