package com.example.persistence;

import android.content.Intent;


public class Person {
    private String gender;
    private String name;
    private int age;

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person(int _age, String _name, String _gender) {
        age = _age;
        name=_name;
        gender=_gender;
    }
}
