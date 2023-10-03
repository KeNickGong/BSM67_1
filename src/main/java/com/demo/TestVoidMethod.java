package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestVoidMethod {
    public Map<String, String> map = new HashMap<String, String>();

    private List l = new ArrayList();

    public void addString(String word, String meaning) {
        System.out.println("Real Method");
        map.put(word, meaning);
    }

    public void add(String str) {
        l.add(str);
    }

    public int size() {
        return l.size();
    }
}
