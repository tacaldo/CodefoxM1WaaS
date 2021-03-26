package com.codefoxflashworx.codefoxm1waas

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.*

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragmentWorkerLocations : Fragment() {

    private lateinit var mMap: GoogleMap
    val home = LatLng(34.114245, -84.09349)

    val home1 = LatLng(34.114245, -84.2)

    val options = GoogleMapOptions()






    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
//        val sydney = LatLng(-34.0, 151.0)
//        googleMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
//        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))



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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps_worker_locations, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}