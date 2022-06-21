package ch.csbe.modul404.lb01praktisch;

public class Pet {

    private String species;
    private String gender;
    private String name;
    private int size;
    private int weight;

    public Pet(String species, String gender) {
        this.species = species;
        this.gender = gender;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
