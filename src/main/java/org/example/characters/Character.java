package org.example.characters;

public abstract class Character {
    private int healthPoints;

    public Character(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    public void takeDamage(int amount) {
        healthPoints -= amount;
    }

    public void gainHealth(int amount) {
        healthPoints += amount;
    }
}
