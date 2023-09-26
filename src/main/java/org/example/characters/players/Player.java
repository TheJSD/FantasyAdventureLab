package org.example.characters.players;

import org.example.characters.Character;

public abstract class Player extends Character {
    private String name;

    public Player(int healthPoints, String name) {
        super(healthPoints);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
