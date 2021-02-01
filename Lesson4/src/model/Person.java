package model;

public class Person {
    private Integer age;
    private String name;
    private String sex;
    private Integer height;
    private String country;
    private String city;
    private String[] alphabet;
    public Person(String sex, Integer age, String name, Integer height, String country, String city) {
        setHeight(height);
        setAge(age);
        setName(name);
        setSex(sex);
        setCountry(country);
        setCity(city);
        //alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    }

    public Person(Integer age, String name) {
    }

    public void setAge(Integer age) {
        if (age > 0) {
            this.age = age;
        }else {
            System.out.println("wrong input");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        if (sex.equals("woman") || sex.equals("man")) {
            this.sex = sex;
        }else {
            System.out.println("wrong input");
        }
    }

    public void setHeight(Integer height) {
        if (height > 0) {
            this.height = height;
        }else {
            System.out.println("wrong input");
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getHeight() {
        return height;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
