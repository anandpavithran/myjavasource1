public class TimeDelay{
  public static void main(String args[]) {
    try {
      while (true) {
        System.out.println(new String("Hello world-10072023"));
        Thread.sleep(3 * 1000); // every 3 seconds
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

