public class SteeringWhel {

    int diametr;
    String materials;

    public SteeringWhel (int diametr, String materials){
        this.diametr = diametr;
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Руль: " +
                " діаметр = " + diametr +
                " , матеріал - " + materials + '\'' +
                '}';
    }
}
