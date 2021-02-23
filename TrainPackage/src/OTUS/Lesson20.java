package OTUS;

public class Lesson20 {
    public static void main(String[] args) {
        Man man1 = new Man();



    }
}
        class Man{
        public Man(){
            System.out.println("Привет из первого констуктора ");

        }

        private String name;
        private int age;

        public void setName(String name){
            this.name = name;
        }

            public String getName() {
                return name;
            }

            public void setAge(int age){
            this.age = age;
        }

            public int getAge() {
                return age;
            }
        }

