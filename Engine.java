public class Engine {
    int amountCylinders;

    public Engine ( int amountCylinders){
        this.amountCylinders =amountCylinders;
    }

    @Override
    public String toString() {
        return " " +
                " кількість циліндрів " + amountCylinders +
                '}';
    }
}
