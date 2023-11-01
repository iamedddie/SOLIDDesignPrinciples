package birds;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
      Chicken chicken= new Chicken();
      Goose goose= new Goose();
      Hawk hawk = new Hawk();
      chicken.flee();
      goose.flee();
      goose.layEgg();
      hawk.peck();
        List<Bird> birdList= new ArrayList<>();
        birdList.add(chicken);
        birdList.add(goose);
        birdList.add(hawk);

        for (Bird b:birdList) {
            System.out.println(b.toString());
        }

    }
}
