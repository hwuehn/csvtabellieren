public class Person {
    private CharSequence name;
    private CharSequence straße;
    private CharSequence wohnort;
    private CharSequence alter;

    public CharSequence getName() {
        return name;
    }
    public CharSequence getStraße() {
        return straße;
    }
    public CharSequence getWohnort() {
        return wohnort;
    }
    public CharSequence getAlter() {
        return alter;
    }

    public void setName(CharSequence name) {
        this.name = name;
    }
    public void setStraße(CharSequence straße) {
        this.straße = straße;
    }
    public void setWohnort(CharSequence wohnort) {
        this.wohnort = wohnort;
    }
    public void setAlter(CharSequence alter) {
        this.alter = alter;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", straße=" + straße +
                ", wohnort=" + wohnort +
                ", alter=" + alter +
                '}';
    }
}
