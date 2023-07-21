class Animal {
    private double weight;
    private int age;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public Animal(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
        this.weight = 0.0d;
        this.age = 0;
    }

    public String say() {
        return "Мяу, гав, хрю, кря!";
    }
}

class Fox extends Animal{
    private String color;

    public Fox(String color) {
        super();
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    @Override
    public String say() {
        return super.say();
    }

    // научите лису говорить
}