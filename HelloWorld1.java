public class HelloWorld1 {
  static String randomString = "String to print";
  static final double PINUM = 3.141529;

  public static void main (String[] args) {
    // System.out.println(PINUM);

    int integerOne = 22;
    int integerTwo = integerOne + 1;

    byte maxByte = 127;
    byte minByte = -128;

    short maxShort = 32767;
    short minShort = -32768;

    long bigLong = 920000000000000000L;

    float someFloat= 3.14F;
    double someDouble = 3.2354225335235234463466;
    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);

    boolean trueOrFalse = true;

    String byteString = Byte.toString(maxByte);
    String intString = Integer.toString(integerOne);

    int doubleToInt = (int) someDouble;

    int stringToInt = Integer.parseInt(intString);
  }
}
