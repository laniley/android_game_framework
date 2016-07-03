package com.little_rocketeers.android_game_framework;

/**
 * Created by Melanie on 03.07.2016.
 */
public abstract class Screen {
    protected final Game game;

    public Screen(Game game) {
        this.game = game;
    }

    public abstract void update(float deltaTime);
    public abstract void paint(float deltaTime);
    public abstract void pause();
    public abstract void resume();
    public abstract void dispose();
    public abstract void backButton();

}
