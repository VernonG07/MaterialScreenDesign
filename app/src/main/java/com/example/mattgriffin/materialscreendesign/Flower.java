package com.example.mattgriffin.materialscreendesign;

/**
 * Created by mattgriffin on 1/12/16.
 */
public class Flower {

    String name;
    int id;

    public Flower(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
