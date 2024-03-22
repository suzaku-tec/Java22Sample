import java.util.Arrays;

public class JEP456 {

  public static void main(String[] args) {
    int total = count(Arrays.asList(new Order(), new Order(), new Order()));
    System.out.println(total);
  }

  static int count(Iterable<Order> orders) {
    int total = 0;
    for (Order _ : orders)    // Unnamed variable
        total++;
    return total;
  }

}

class Order {}
