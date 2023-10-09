import java.util.Scanner;

public class AlgorithmImpl {
    private double rad1;
    private double rad2;
    private double rad3;
    private final double pi = Math.PI;

    public AlgorithmImpl()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("\nEnter radius 1 measurement:\t");
        rad1 = input.nextDouble();
        System.out.printf("Enter radius 2 measurement:\t");
        rad2 = input.nextDouble();
        System.out.printf("Enter radius 3 measurement:\t");
        rad3 = input.nextDouble();

        System.out.printf("\nCalculated Area differences:\t%f\n",this.calcAreasAndDiff());
    }
    public double calcAreasAndDiff()
    {
        double area1 = this.pi * Math.pow(rad1, 2);
        double area2 = this.pi * Math.pow(rad2, 2);
        double area3 = this.pi * Math.pow(rad3, 2);
        double sum = area1 + area2;

        return (sum - area3);
    }

    public static void main(String[] args) {
        AlgorithmImpl imp = new AlgorithmImpl();
    }
}
