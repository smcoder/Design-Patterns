package com.personal;

import java.io.*;

/**
 * Created by mac on 09/07/2017.
 */
public class DeepClone implements Serializable {
    private Attachment attachment;
    private String name;
    private Integer age;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // deep cloning using serialization techniques
    public DeepClone deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        // writes an object to a stream
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);

        oos.writeObject(this);

        // get the object from the stream
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        return (DeepClone) ois.readObject();
    }
}
