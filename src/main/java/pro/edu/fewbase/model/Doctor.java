package pro.edu.fewbase.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Doctor {

    @Id
    private String id;
    private String name;
    private int illByCovid;

    public Doctor() {
    }

    public Doctor(String name, int illByCovid) {
        this.name = name;
        this.illByCovid = illByCovid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIllByCovid() {
        return illByCovid;
    }

    public void setIllByCovid(int illByCovid) {
        this.illByCovid = illByCovid;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", illByCovid=" + illByCovid +
                '}';
    }



}
