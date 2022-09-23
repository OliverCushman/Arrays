public class Arrays
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo","Foxtrot",
        "Golf","Hotel","India","Juliett","Kilo","Lima","Mike","November","Oscar",
        "Papa","Quebec","Romeo","Sierra","Tango","Uniform","Victor","Whiskey",
        "X-Ray","Yankee","Zulu"};
        int lengthMinusOne = strArray.length - 1;
        for (int indI = 0; indI < strArray.length; indI++) {
            System.out.println(strArray[indI]);
        }
        for (String value : strArray) {
            System.out.print(value);
        }
        System.out.println();
        for (int indII = 0; indII < strArray.length; indII++) {
            System.out.print(strArray[indII]);
            if (indII < lengthMinusOne) { //There shouldn't be ; anywhere on this line
               System.out.print("-"); //Alpha-Bravo-Charlie-Delta-Echo...
            }
        }
    }
}