package com.example.cricbuzz.model.match;

import com.example.cricbuzz.common.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stadium {
    private String name;
    private Address address;

    public Stadium(String name) {
        this.name = name;
    }
}
