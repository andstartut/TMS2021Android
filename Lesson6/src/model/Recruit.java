package model;

public class Recruit extends Person{
    private String rank;
    public Recruit(String sex, Integer age, String name, Integer height, String rank) {
        super(sex, age, name, height);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void speak() {
        System.out.println("Здравия желаю");
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "age=" + super.getAge() +
                ", name='" + super.getName() + '\'' +
                ", sex='" + super.getSex() + '\'' +
                ", height=" + super.getHeight() + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
