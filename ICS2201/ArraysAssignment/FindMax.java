package ArraysAssignment;

public class FindMax {
    public static int findMax(int[] myArray) {
        int maxNo = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxNo) {
                maxNo = myArray[i];
            }
        }
        return maxNo;
    }

    public static void main(String[] args) {
        int[] myArray = {30, 70, 20, 60, 60, 15};
        int maxNo = findMax(myArray);
        System.out.println("The maximum number in the array is: " + maxNo);
    }
}
