public class Pattern11 {
  public static void main(String... args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n + 1); j++) {
        if (j % 2 != 0) {
          System.out.print(i + " ");
        } else {
          int k = j / 2;
          System.out.print(k + " ");
        }
      }
      System.out.println("");
    }
  }
}
