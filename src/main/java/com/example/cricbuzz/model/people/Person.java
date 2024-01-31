package com.example.cricbuzz.model.people;

import com.example.cricbuzz.common.Contact;
import com.example.cricbuzz.common.PersonalInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    private String name;
    private PersonalInfo personalInfo;

    public Person(String name) {
        this.name = name;
    }

    private Contact contact;
}
