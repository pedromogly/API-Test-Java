package com.study.spring_study.Services;

import org.springframework.stereotype.Service;
import com.study.spring_study.Services.Models.JsonExample;

@Service
public class JsonService {
    public JsonExample process(JsonExample input) {
        return new JsonExample(input.playerNick, input.positions);
    }
}