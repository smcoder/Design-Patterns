package com.personal;

/**
 * Created by mac on 09/07/2017.
 * Shallow clone object
 */
public class TestObject implements Cloneable {
    private Attachment attachment;
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    protected TestObject clone() throws CloneNotSupportedException {
        return (TestObject) super.clone();
    }
}
