public class Pattern9 {
  public static void main(String... args) {
    for (int i = 1; i <= 5; i++) {
      int n = 5;
      for (int j = 1; j <= n; j++) {
        int k = j * i;
        System.out.print(k + " ");
      }
      System.out.println("");
    }

  }
}
