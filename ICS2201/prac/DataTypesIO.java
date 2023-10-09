package prac;

public class DataTypesIO {
   public static int bmi;
   public static int starndardBmi = 24;
    public static void main(String[] args) {
        bmi = 26;

        if (bmi < starndardBmi)
        {
            System.out.println("Your bmi = " + bmi + ", is lower than normal");
        } else if (bmi > starndardBmi) {
            System.out.println("Your bmi = " + bmi + ",is higher than normal");
        }
        else {
            System.out.println("Your bmi is normal");
        }
    }
}
