import java.util.Arrays;

public class Main {
    public static void main (String[] args){

        int random1 = getRandomNumber (10,1);
        int random2 = getRandomNumber (10, 1) ;
        Car [][] carArrayOfArray = new Car[random1][random2];

        for( int i = 0; i < carArrayOfArray.length;i++){
            for (int j = 0; j < carArrayOfArray[i].length; j++){
                carArrayOfArray[i][j] = new Car(getRandomNumber(454 , 20),getRandomNumber(2000, 1985),new Engine(getRandomNumber(8, 2)),
                                        new SteeringWhel(getRandomNumber(8, 1), getRandomNumber(10, 0) <5 ? "Шкіра": "Дерево")) ;

            }
        }
        for (Car[] carArray: carArrayOfArray){
            System.out.println(Arrays.deepToString(carArrayOfArray));
        }
        }




    private static int getRandomNumber(int n, int i)  {
        return (int) (i + Math.random()*n);
    }
}




