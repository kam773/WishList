package com.example.android.wishlist;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Kamil on 2018-03-17.
 */

public class BirthdayApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded().build();

        Realm.setDefaultConfiguration(realmConfiguration);

    }
}
