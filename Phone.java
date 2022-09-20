public class Phone  {
    int number;
    String model;
    int weight;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println(number + " " + model + " " + weight);
    }

        public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void reciveCall(int number) {
        System.out.println("Звонит номер " + number);
    }


    public Phone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {}

    public void reciveCall(String name, int number) {
        System.out.println("Звонит " + name + " Номер телефона " + number);
    }













}
