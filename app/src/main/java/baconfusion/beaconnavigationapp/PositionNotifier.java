package baconfusion.beaconnavigationapp;

/**
 * Created by Stefan on 20-Sep-16.
 */
public interface PositionNotifier {

    void onDataArrived(float x, float y, float[] b_x, float[] b_y, int[] b_i);

}
