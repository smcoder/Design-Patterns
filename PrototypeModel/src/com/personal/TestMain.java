package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestObject testObject = new TestObject();
        testObject.setAge(1);
        testObject.setName("1");
        System.out.println(testObject.getAge());
        System.out.println(testObject.getName());

        TestObject testObject1 = testObject.clone();
        testObject1.setName("2");
        testObject1.setAge(2);
        System.out.println(testObject1.getName());
        System.out.println(testObject1.getAge());

        System.out.println(testObject == testObject1);
        System.out.println(testObject.getAge() == testObject1.getAge());
        System.out.println(testObject.getName() == testObject1.getName());
    }
}
