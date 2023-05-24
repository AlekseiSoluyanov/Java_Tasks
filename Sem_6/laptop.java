package Sem_6;
import java.util.HashMap;
import java.util.Map;

public class laptop {
    String color;
    String os;
    int hhd;
    int RAM;

    public laptop(String color, String os, int hhd, int RAM) {
        this.color = color.toLowerCase();
        this.os = os.toLowerCase();
        this.hhd = hhd;
        this.RAM = RAM;
    }    

@Override
public String toString(){
    return color + ", " + os + ", " + hhd + ", " + RAM;
    }

    public Map<Object, Object> parametrsMap() {
        Map<Object, Object> parametrsLaptops = new HashMap<>();
        parametrsLaptops.put("color", color);
        parametrsLaptops.put("os", os);
        parametrsLaptops.put("hhd", hhd);
        parametrsLaptops.put("RAM", RAM);
        return parametrsLaptops;
    }
}