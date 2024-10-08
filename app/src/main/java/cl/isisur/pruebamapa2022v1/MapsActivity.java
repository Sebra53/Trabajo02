package cl.isisur.pruebamapa2022v1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.isisur.pruebamapa2022v1.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng FdBL1 = new LatLng(-36.61514470088882, -72.10211354391741);
        LatLng IPVG = new LatLng(-36.589809, -72.082673);
        LatLng FdBL2 = new LatLng(-36.61077505798128, -72.10441668972292);
        LatLng FdBL3 = new LatLng(-36.611694483042065, -72.10117750625646);
        LatLng FdBL4 = new LatLng(-36.61056744435371, -72.10228597208149);

        mMap.addMarker(new MarkerOptions().position(FdBL1).title("FdBL1"));
        mMap.addMarker(new MarkerOptions().position(FdBL2).title("FdBL2"));
        mMap.addMarker(new MarkerOptions().position(FdBL3).title("FdBL3"));
        mMap.addMarker(new MarkerOptions().position(FdBL4).title("FdBL4"));
        mMap.addMarker(new MarkerOptions().position(IPVG).title("UBICACION ACTUAL"));




        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(IPVG,15));


        //mMap.setMinZoomPreference(10.0f);
        //mMap.setMaxZoomPreference(50.0f);

    }
}