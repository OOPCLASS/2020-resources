package ro.utcluj;

import java.util.Date;

public class Main {

  private static final long ONE_DAY_IN_MS = 86400000;
  private int years;

  public static void main(String[] args) {
    // write your code here
    int carRangeInKm = 10;
  }

  public static long getElapsedTimeInDaysSince(long timestampInMs) {
    return getElapsedTimeInMsSince(timestampInMs) / ONE_DAY_IN_MS;
  }

  /**
   * @param timestampInMs
   * @return
   */
  public static long getElapsedTimeInMsSince(long timestampInMs) {
    long now = new Date().getTime();
    //return now - timestampInMs;
    boolean flag = true;

    int a = 10;
    if (flag) {
      return 0L;
    }
//
//        int a = 10;
//
//        return switch (a) {
//            case 10 -> 10L;
//            case 100 -> 100L;
//            default -> 0L;
//        };

//    return switch (a) {
//      case 10 -> 10L;
//      case 100 -> 100L;
//      default -> -1L;
//    };
  }
}
