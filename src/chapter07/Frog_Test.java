package chapter07;

/**
 * Created by luoqiuyu on 16/11/12.
 */
class Amphibian{
    public void moveInWater(){
        System.out.println("Moving in Water");
    }

    public void moveOnLand(){
        System.out.println("Moving on land");
    }

}

class Frog extends Amphibian{

}

class Frog2 extends Amphibian{
    @Override
    public void moveInWater() {
        System.out.println("Frog swimming");
    }

    @Override
    public void moveOnLand() {
        System.out.println("Frog jumping");
    }
}

public class Frog_Test {
    public static void main(String[] args){
        Amphibian a = new Frog();
        a.moveInWater();
        a.moveOnLand();

        Amphibian b = new Frog2();
        b.moveInWater();
        b.moveOnLand();
    }

}
