package model;

public class Person {
    private Integer age;
    private String name;
    private String sex;
    private Integer height;
    private Address address;

    public Person(String sex, Integer age, String name, Integer height) {
        setHeight(height);
        setAge(age);
        setName(name);
        setSex(sex);
    }

    public Person(Integer age, String name) {
    }

    public void setAge(Integer age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("wrong input");
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        if (sex.equals("woman") || sex.equals("man")) {
            this.sex = sex;
        } else {
            System.out.println("wrong input");
        }
    }

    public void setHeight(Integer height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("wrong input");
        }
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

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        if (!address.getCountry().equals("")) {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    ", height=" + height +
                    ", " + address.toString() +
                    '}';
        } else {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    ", height=" + height +
                    '}';
        }
    }
}
