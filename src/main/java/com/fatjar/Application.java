package com.fatjar;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Map<String, String> map = new HashMap<>();

        map.put("name", "Denys");
        map.put("lastName", "Olofinskyi");

        System.out.println(gson.toJson(map));
    }
}
