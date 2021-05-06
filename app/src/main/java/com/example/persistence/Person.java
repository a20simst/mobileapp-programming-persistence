package com.example.persistence;

import android.content.Intent;


public class Person {
    private String gender;
    private String name;
    private int age;

    public Person(int _age, String _name, String _gender) {
        age = _age;
        name=_name;
        gender=_gender;
    }
}
