package gr.aueb.cf.ch20.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz= Teacher.class;
        Class<?> aclass= Class.forName("gr.aueb.cf.ch20.reflection.Teacher");

        Constructor<?>[] publicConstructors = Teacher.class.getConstructors();
        Constructor<?>[] constructorsList = Teacher.class.getDeclaredConstructors();

        Constructor<?> defaultCtor= clazz.getDeclaredConstructor();
        defaultCtor.setAccessible(true);
        Teacher teacher = (Teacher) defaultCtor.newInstance();
    }
}
