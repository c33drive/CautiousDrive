package cautiousdrive.com.cautiousdrive;

/**
 * Created by Petrus on 05/03/2018.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LatLngBounds Namibia = new LatLngBounds(new LatLng(-22.9576,18.4904),new LatLng(-22.9576,18.4904));

    private final static LatLng Khomas = new LatLng(-22.75, 17.08333);
    private final static LatLng Erongo = new LatLng(-23.1166662,14.8666632);
    private final static LatLng Oshana = new LatLng(-18.166666, 15.749997);
    private final static LatLng Otjozondjupa = new LatLng(-20.33333, 18.0);
    private final static LatLng Okavango_W_or_E = new LatLng(-17.916663,19.749997);
    private final static LatLng Hardap = new LatLng(-24.6166642,17.9499962);

    private Marker mKhomas;
    private Marker mErongo;
    private Marker mOshana;
    private Marker mOtjozodjupa;
    private Marker mOkavango_W_or_E;
    private Marker mHardap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mKhomas = mMap.addMarker(new MarkerOptions().position(Khomas).title("Khomas Region").snippet("8547 Number of accident, 2011 report"));
        mKhomas.setTag(0);
        mErongo = mMap.addMarker(new MarkerOptions().position(Erongo).title("Erongo Region").snippet("2059 Number of accident, 2011 report"));
        mErongo.setTag(0);
        mOshana = mMap.addMarker(new MarkerOptions().position(Oshana).title("Oshana Region").snippet("1344 Number of accident, 2011 report"));
        mOshana.setTag(0);
        mOtjozodjupa = mMap.addMarker(new MarkerOptions().position(Otjozondjupa).title("Otjozondjupa Region").snippet("1053 Number of accident, 2011 report"));
        mOtjozodjupa.setTag(0);
        mOkavango_W_or_E = mMap.addMarker(new MarkerOptions().position(Okavango_W_or_E).title("Okavango West and East").snippet("733 Number of accident, 2011 report"));
        mOkavango_W_or_E.setTag(0);
        mHardap = mMap.addMarker(new MarkerOptions().position(Hardap).title("Hardap Region").snippet("579 Number of accident, 2011 report"));
        mHardap.setTag(0);
        // Add a marker in Sydney, Australia, and move the camera.
        //LatLng nam = new LatLng(-22, 18);
        //mMap.addMarker(new MarkerOptions().position(nam).title("Namibia"));
        //mMap.setLatLngBoundsForCameraTarget(Namibia);
        //mMap.moveCamera(CameraUpdateFactory.newLatLng());
    }
}
