public class Pattern7 {
  public static void main(String... args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = (10 * i) - 9; j <= (10 * i) - 1; j += 2) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }
}
