package object;

import java.io.Serializable;

public class Cat implements Serializable {

    private static final  long serialVersionUID = 2L;
    private String name;
    private int age;
    private String color;
    private boolean castrated;
    private transient boolean noisy;

    public Cat(String name, int age, String color, boolean castrated, boolean noisy) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.castrated = castrated;
        this.noisy = noisy;
    }

    public boolean isCastrated() {
        return castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNoisy() {
        return noisy;
    }

    public void setNoisy(boolean noisy) {
        this.noisy = noisy;
    }
}
