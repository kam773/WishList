package com.example.android.wishlist;

import io.realm.RealmObject;

/**
 * Created by Kamil on 2018-03-17.
 */

public class Person extends RealmObject {

    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
