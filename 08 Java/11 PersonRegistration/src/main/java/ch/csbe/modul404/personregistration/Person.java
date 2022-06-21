package ch.csbe.modul404.personregistration;

public class Person {
    private String givenName;
    private String surname;
    private byte age;
    private String description;

    public Person(String givenName, String surname, byte age, String description) {
        this.givenName = givenName;
        this.surname = surname;
        this.age = age;
        this.description = description;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public byte getAge() {
        return age;
    }

    public String getDescription() {
        return description;
    }
}
