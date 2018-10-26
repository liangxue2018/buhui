package Sui1025;

import java.lang.reflect.Field;

public class Xin {
    public Peo print() {
        Peo peo = new Peo();
        Class clazz = peo.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(CustomAnnotation.class)) {
                clazz.
            }
        }
        return peo;
    }
}
