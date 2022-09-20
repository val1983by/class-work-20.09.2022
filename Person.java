public class Person {
    String fullname;
    int age;

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {}

    public void move(){
        System.out.println(fullname + " ГОВОРИТ");
    }

    public void talk(String talk){
        System.out.println(fullname + " ГОВОРИТ:" + talk);
    }


}
