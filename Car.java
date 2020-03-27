public class Car {


    int horsePower;
    int yearOfproduct;

    Engine engine;
    SteeringWhel steeringWhel;

    public Car (int horsePower, int yearOfproduct, Engine engine, SteeringWhel steeringWhel){
        this.engine = engine;
        this.horsePower = horsePower;
        this.steeringWhel = steeringWhel;
        this.yearOfproduct = yearOfproduct;
    }

    @Override
    public String toString() {
        return "Автомобіль: " +
                " потужність " + horsePower +
                " , рік випуску " + yearOfproduct +
                " , " + engine +
                " , " + steeringWhel +
                '}';
    }
}
