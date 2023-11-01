package birds;

public interface IBird {
     void eat() ;

     default void layEgg() {
          System.out.println("Hatching eggs......");
     }


}
