package Tuan2;
class Manager extends Employee {
    private double bonus;
    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    @Override
    public String toString() {
        return "Manager[" + super.toString() + ", bonus=" + bonus + "]";
    }
}
