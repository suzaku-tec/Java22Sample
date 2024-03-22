import java.util.stream.*;
import java.util.*;

public class JEP461 {
  public static void main(String[] args) {
    // will contain: [[1, 2, 3], [4, 5, 6], [7, 8]]
    List<List<Integer>> windows =
      Stream.of(1,2,3,4,5,6,7,8).gather(Gatherers.windowFixed(3)).toList();
    System.out.println(windows);
  }
}
