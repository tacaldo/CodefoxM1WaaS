package com.example.codefoxm1waas


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.*

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {

        val home = LatLng(34.114245, -84.09349)

        val home1 = LatLng(34.114245, -84.2)

//        googleMap?.apply {
//            val sydney = LatLng(-33.852, 151.211)
//            addMarker(
//                MarkerOptions()
//                    .position(home)
//                    .title("Marker for home")
//
//
//            )
//            addMarker(MarkerOptions().position(home).title("Painter - Available")).showInfoWindow()
//            moveCamera(CameraUpdateFactory.zoomTo(10f))
//            moveCamera(CameraUpdateFactory.newLatLng(home))
//
//            addMarker(MarkerOptions().position(home1).title("Painter1 - Available1")).showInfoWindow()
//            moveCamera(CameraUpdateFactory.zoomTo(10f))
//            moveCamera(CameraUpdateFactory.newLatLng(home1))
//
//        }


        val options = GoogleMapOptions()
        //var job = Job(jobId = 1, jobName = "jobTest", jobDescription = "jobDescr1", jobFacets = null, jobLocationInfo = null)

        mMap = googleMap
        // Sets the map type to be "hybrid"
//        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL

        mMap.addMarker(MarkerOptions().position(home).title("Painter - Available")).showInfoWindow()
        mMap.addMarker(MarkerOptions().position(home1).title("Painter--1 - Available1")).showInfoWindow()

        val brisbane = LatLng(-27.4,  153.0)


        mMap.moveCamera(CameraUpdateFactory.newLatLng(home))

        // Create a LatLngBounds that includes Australia.
        val HOME = LatLngBounds(
            LatLng(34.114245, -84.09349), LatLng(34.114245, -84.09349)
        )


        // mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(HOME, 20))
        mMap.moveCamera(CameraUpdateFactory.zoomTo(10f))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(home))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(home1))


    }
}