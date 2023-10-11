package Tuan2;
class Main {
    public static void main(String[] args) {
        Person p = new Person("Nam", 22);
        Employee e = new Employee("Vinh", 27, 5000.0);
        Manager m = new Manager("Tuan", 40, 10000.0, 1500.0);

        System.out.println(p);
        System.out.println(e);
        System.out.println(m);

        System.out.println(p instanceof Person);
        System.out.println(e instanceof Person);
        System.out.println(e instanceof Employee);
        System.out.println(m instanceof Person);
        System.out.println(m instanceof Employee);
        System.out.println(m instanceof Manager);

        System.out.println(p.getName());
        System.out.println(e.getName());
        System.out.println(m.getName());
        System.out.println(e.getSalary()); //
        System.out.println(m.getSalary()); //
        System.out.println(m.getBonus()); //
    }
}