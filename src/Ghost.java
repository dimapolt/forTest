public class Ghost {
    private double age;

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    private boolean isFly;

    public Ghost(double age, boolean isFly) {
        this.age = age;
        this.isFly = isFly;
    }

    public String say(){
        return "Бу!";
    }
}

class GhostShip extends Ghost {

    public GhostShip(double age, boolean isFly) {
        super(age, isFly);
    }

    @Override
    public String say() {
        return super.say();
    }
}