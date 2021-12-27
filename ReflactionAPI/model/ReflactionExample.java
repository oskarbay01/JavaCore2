package com.oskarbay.lesson22.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflactionExample {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User(24L, "Askar",24);
        testMehtods(user);
//        testFields(user);
//        Class<? extends User> userClass = user.getClass();
//        Class<User> userClass1 = User.class;
//        System.out.println(userClass == userClass1);
//        testConstructor();
    }

    public static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User petr = constructor.newInstance(5L, "Petr");
        System.out.println(petr);
    }

    public static void testFields(User user) throws IllegalAccessException {
        Field[] declaredFields = User.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = declaredField.get(user);
            System.out.println(value);
        }
    }

    public static void testMehtods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method declaredMethods = user.getClass().getDeclaredMethod("getName");
        System.out.println(declaredMethods.invoke(user));
    }
}

