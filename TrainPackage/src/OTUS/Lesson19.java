package OTUS;

public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.age = 18;
        human1.name = "Andrew";
        human1.getInfo();

    }
}

    class Human {
        String name;
        int age;


        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getName(){
            return  name;
        }
        public int getAge(){
            return age;
        }
        public void getInfo(){
            System.out.println(name +" "+ age);
        }
    }


