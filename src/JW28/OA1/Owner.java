package JW28.OA1;

public class Owner {
    private String name;
    private String surname;

    public Owner(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public void displayOwner()
    {
        System.out.println("Właściciel: " + this.name + " " + this.surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
