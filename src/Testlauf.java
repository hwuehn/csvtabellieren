public class Testlauf {

    public static void main(String[] args) {
        CsvString langerString = new CsvString();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        SequenzFilter filter1 = new SequenzFilter();
        SequenzFilter filter2 = new SequenzFilter();
        SequenzFilter filter3 = new SequenzFilter();
        PersonenVerwaltung pv1 = new PersonenVerwaltung(person1, filter1, langerString);
        PersonenVerwaltung pv2 = new PersonenVerwaltung(person2, filter2, langerString);
        PersonenVerwaltung pv3 = new PersonenVerwaltung(person3, filter3, langerString);

        pv1.verwalte();
        pv2.verwalte();
        pv3.verwalte();

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());












    }
}
