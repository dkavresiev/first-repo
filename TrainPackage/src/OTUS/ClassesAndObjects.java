package OTUS;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Andrew");
        person1.setAge(18);
        person1.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String username){
        if(username.isEmpty()){
            System.out.println("Введи имя, Дурак !");
        }else {
        name = username;
    }}
    public String getName(){
        return name;

    }
    public void setAge(int userage){
        if(userage < 0){
            System.out.println("Отрицательного возраста нет ,");
        }else{
        age = userage;
    }}
    public int getAge(){
        return age;
    }

    int yearToYear(){
        int years = 65 - age;
        return years;
    }


    void speak() {
        System.out.println("Меня зовут "+ name + ", Мне сейчас "+ age );
    }

    void hello(){
        System.out.println("Hello");
    }
}

//Офигенная ТЕМА!
