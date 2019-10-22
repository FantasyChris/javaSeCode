package faceObject;

public class Person {
    private String name;
    private int age;
    private boolean sex;

    public Person(String name,int age,boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void study() {
        System.out.println(name+"is studying");
    }

    public int getAge() {
        return  age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void showAge() {
        System.out.println(age);
    }

    public int addAge(int num) {
        age = age + num;
        return age;
    }

    public static void main(String[] args) {
        Person Jack = new Person("Jack", 18, true);
        Jack.study();
        Jack.showAge();
        Jack.addAge(2);
        Jack.showAge();
        Person lucy = new Person("Lucy", 20, false);
        lucy.study();
        lucy.showAge();


    }
}
