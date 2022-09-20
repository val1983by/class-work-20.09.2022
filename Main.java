public class Main {
    public static void main(String[] args) {
        Phone ph1 = new Phone(111222333, "model1", 100);
        Phone ph2 = new Phone(222333444, "model2", 200);
        Phone ph3 = new Phone(555666777, "model3",300);

        System.out.println(ph1.toString());
        System.out.println(ph2.toString());
        System.out.println(ph3.toString());

        ph1.print();
        ph2.print();
        ph3.print();

        System.out.println("recive call");
        ph1.reciveCall(12345);
        ph2.reciveCall(123456);
        ph3.reciveCall(1234567);

        System.out.println("recive call2");
        ph1.reciveCall("name1", 1234);
        ph2.reciveCall("name2",12345);
        ph3.reciveCall("name3",123456);

        Person pers1 = new Person();
        Person pers2 = new Person ("Персон Персонов Персонович", 20);
        pers2.move();
        pers2.talk("говорит что-то персон2");
    }



}
