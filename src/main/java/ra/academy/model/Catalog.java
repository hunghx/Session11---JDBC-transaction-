package ra.academy.model;

public class Catalog {
    private int id;
    private String name;
    private int countPro;

    public Catalog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPro() {
        return countPro;
    }

    public void setCountPro(int countPro) {
        this.countPro = countPro;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countPro=" + countPro +
                '}';
    }
}
