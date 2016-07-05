package example.Data;

/**
 * Created by MEUrena on 7/4/16.
 * All rights reserved.
 */
public class Subject {

    private String code;
    private String name;

    public Subject() { }

    public Subject(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
