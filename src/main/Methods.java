
public class Methods {

    public static int calculateSurfaceAreaOrVolumeOfCube(boolean surfaceCalculation, int width) {

        int sidesOnCube = 6;
        int value;

        if (surfaceCalculation) {
            value = width * width * sidesOnCube;
        }
        else {
            value = width*width*width;
        }
        return value;
    }


    public static int sumEdges(int[] arr, boolean add10000) {

        int result;

        if (add10000)
            result = arr[0] + arr[arr.length - 1] + 10000;
        else
            result = arr[0] + arr[arr.length - 1];

        return result;
    }

}
