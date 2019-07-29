import java.util.Scanner;

public class DistanceInDesiredMetric {
    private static double calculateDistance(double[] points)
    {
        return (Math.sqrt( Math.pow(points[0]-points[2], 2) + Math.pow(points[1]-points[3], 2)));
    }

    private static double convertMetersToFeet(double distance)
    {
        return Math.round(distance * 3.281 * 100.0)/100.0;
    }

    private static double convertMetersToInches(double distance)
    {
        return Math.round(distance * 39.37 * 100.0)/100.0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the points whose distance is to be calculated as (x1, y1), (x2, y2)");
        Scanner scanInput = new Scanner(System.in);
        double[] points = new double[4];
        points[0] = scanInput.nextDouble();
        points[1] = scanInput.nextDouble();
        points[2] = scanInput.nextDouble();
        points[3] = scanInput.nextDouble();
        double distance = Math.round(calculateDistance(points) * 100.0 )/ 100.0;
        System.out.println("Enter 1:Distance in meters 2:Distance in feet 3: Distance in inches");
        int userOption = scanInput.nextInt();
        switch (userOption)
        {
            case 1:
                System.out.println("Distance in meters: " + distance);
                break;

            case 2:
                System.out.println("Distance in feet: " + convertMetersToFeet(distance));
                break;

            case 3:
                System.out.println("Distance in inches: " + convertMetersToInches(distance));
                break;

            case 4:
                System.out.println("Enter valid input");
                break;
        }
    }
}
