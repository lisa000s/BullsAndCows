class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String temn = p1.name;
        int tempa = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = temn;
        p2.age = tempa;

    }
}