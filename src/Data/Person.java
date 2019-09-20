package Data;

public class Person {
    private String name;
    private String straße;
    private String wohnort;
    private String alter;

    public String getName() {
        return name;
    }
    public String getStraße() {
        return straße;
    }
    public String getWohnort() {
        return wohnort;
    }
    public String getAlter() {
        return alter;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStraße(String straße) {
        this.straße = straße;
    }
    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }
    public void setAlter(String alter) {
        this.alter = alter;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Data.Person{" +
                "name='" + name + '\'' +
                ", straße='" + straße + '\'' +
                ", wohnort='" + wohnort + '\'' +
                ", alter='" + alter + '\'' +
                '}';
    }


}
