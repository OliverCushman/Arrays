public class Arrays
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int indI = 0; indI < strArray.length; indI++) {
            System.out.println(strArray[indI]);
        }
        for (int indII = 0; indII < strArray.length; indII++) {
            System.out.print(strArray[indII]);
            if (indII < 4) { //There shouldn't be ; anywhere on this line
               System.out.print("-"); //Alpha-Bravo-Charlie-Delta-Echo
            }
        }
    }
}