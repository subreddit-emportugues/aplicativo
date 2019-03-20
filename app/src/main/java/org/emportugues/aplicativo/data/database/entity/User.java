package org.emportugues.aplicativo.data.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "users")
public class User {

    @PrimaryKey
    public int id;
    public String subreddit;
    public String description;
    public boolean nsfw;
    public String age;
    public int subscribers;
    public String icon;

}
