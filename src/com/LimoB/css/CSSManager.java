package com.LimoB.css;

import java.util.HashMap;

public class CSSManager {
    public HashMap<String, Object> values;

    public void manage() {
        values = new HashMap<String, Object>();
        values.put("color", "chartreuse");
        values.put("font-family", "'Comfortaa', sans-serif");
        values.put("font-size", "50px");
        values.put("background", "black");
    }
}
