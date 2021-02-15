package model;

import exceptions.NoAddressException;
import exceptions.CantSpeakException;
import interfaces.Speaker;

public class Person implements Speaker {
    private Integer age;
    private String name;
    private String sex;
    private Integer height;
    private Address address;

    public Person(String sex, Integer age, String name, Integer height) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.height = height;
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

    public Address getAddress() throws NoAddressException {
        if (address == null) {
            throw new NoAddressException("The person has not address");
        }
        return address;
    }


    @Override
    public void speak() throws CantSpeakException {
        System.out.println(
                "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                '}'
        );
    }

}
