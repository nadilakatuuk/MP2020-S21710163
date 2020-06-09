public class Main {
    public static void main(String[] args){
        byte myByteValue = 90;
        short myShortValue = 900;
        int myIntValue = 70;

        long longTotal = (50000L + 10L) * (myByteValue + myShortValue + myIntValue);
        System.out.println("Long Total = " + longTotal);

    }
}
