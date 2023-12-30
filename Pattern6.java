public class Pattern6 {
  public static void main(String... args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = (5 * i) - 4; j <= (i * n); j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }
}
