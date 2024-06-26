package org.example.homework_2024_01_23.translator;
// имя, возраст, пол и умеет переводить с одного языка на другой.
public abstract class Translator {

    private String name;
    private int age;
    private String gender;

    public Translator() {
    }

    public Translator(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    abstract void canTranslate();

}
