package lesson5;

public class Passport {
    private String name;
    private String family;
    private int weight;
    private int hight;

    private int age;
    private boolean human = true;
    double IMT;

    public Passport(String name, String family, int age, boolean human) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.human = human;
    }

    public Passport(String name, String family, int weight, int hight, int age, boolean human) {
        this.name = name;
        this.family = family;
        this.weight = weight;
        this.hight = hight;
        this.age = age;
        this.human = human;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public boolean isHuman() {
        return human;
    }

    public double getIMT() {
        return IMT;
    }

    public void print() {
        System.out.println(name);
        System.out.println(family);
        System.out.println(age);
        System.out.println("Human - " + human);
    }

    private double setupIMT(int h, int w) {
        return (double) w / ((double) h * (double) h);
    }
}