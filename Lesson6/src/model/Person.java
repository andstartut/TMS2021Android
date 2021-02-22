package model;

import exceptions.NoAddressException;
import exceptions.CantSpeakException;
import exceptions.SurNameException;
import interfaces.IPerson;
import interfaces.Speaker;


public class Person implements IPerson, Speaker {
    private String sex;
    private int age;
    private String name;
    private String surname;
    private int height;
    private Address address;

    public Person(String sex, Integer age, String name, String surname, Integer height) {
        this.sex = sex;
        this.age = age;
        setName(name);
        setSurname(surname);
        this.height = height;
    }

    private String personSurNameFilter(String surName) throws SurNameException {
        if (surName == null || surName.isEmpty()) {
            throw new SurNameException("You sent 'null'.");
        }
        String text = surName.trim().toLowerCase();
        String textCapitalLetter = text.substring(0, 1).toUpperCase();
        String textSmallLetters = text.substring(1).toLowerCase();
        String textCommon = textCapitalLetter + textSmallLetters;
        if (textCommon.indexOf(" ") > 0) {
            try {
                throw new SurNameException("Wrong input " + textCommon + ". Don't use 'space'.");
            } catch (SurNameException e) {
                textCommon = textCommon.replace(" ", "");
                e.printStackTrace();
            }
        }
        return textCommon;
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

    public void setName(String name){
        try {
            this.name = personSurNameFilter(name);
        } catch (SurNameException e) {
            e.printStackTrace();
        }
    }

    public void setSurname(String surname) {
        try {
            this.surname = personSurNameFilter(surname);
        } catch (SurNameException e) {
            e.printStackTrace();
        }
    }

    public void setSex(String sex) {
        if (sex.equals("woman") || sex.equals("man")) {
            this.sex = sex;
        } else {
            System.out.println("wrong input. You need to write 'woman' or 'man'");
        }
    }

    public void setHeight(Integer height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("wrong input");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public int getHeight() {
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
