package com.study.spring_study.Services;

public class JsonExample {
    public String playerNick;
    public String positions;
    public JsonExample(String player,String positions) {
        this.playerNick = player;
        this.positions = positions; 
    }

    public JsonExample process(JsonExample input) {
        return new JsonExample(input.playerNick, input.positions);
    }
}
