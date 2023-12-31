public class Pattern8 {
  public static void main(String... args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = (10 * i) + 2; j <= 10 * (i + 1); j += 2) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }
}
