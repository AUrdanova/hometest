package com.company;

public class Hero {
    private int health;
    private int damage;
    private String heroSuperPower;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getHeroSuperPower() {
        return heroSuperPower;
    }

    public Hero(int health, int damage, String heroSuperPower) {
        this.health = health;
        this.damage = damage;
        this.heroSuperPower = heroSuperPower;


    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }


}

