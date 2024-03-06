package com.example.got2go.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.got2go.R
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Button
import androidx.appcompat.widget.PopupMenu

class MapFragment  //TODO: update fragment w/g2g stuff
    : Fragment() {

    private lateinit var sortButton: Button
    private lateinit var filterSpinner: Spinner
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //var btnMetal: ImageButton = view.findViewById(R.id.btnMetal)
        //btnMetal.setOnClickListener(View.OnClickListener { showMetalDialog() })

        filterSpinner = view.findViewById(R.id.filterSpinner)
        val filterItems = listOf("Wheelchair Accessible", "No Passcode", "Inclusive Stall", "Hygiene Products", "Baby Station", "Urinals", "Single Stall", "Family Restroom")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, filterItems)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        filterSpinner.adapter = adapter

        sortButton = view.findViewById(R.id.sortButton)

        sortButton.setOnClickListener {
            // Create a PopupMenu
            val popupMenu = PopupMenu(requireContext(), sortButton)
            popupMenu.menuInflater.inflate(R.menu.sort_options_menu, popupMenu.menu)

            // Set item click listener for the menu items
            popupMenu.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.sortOption1 -> {
                        // Handle sort option 1
                        true
                    }
                    R.id.sortOption2 -> {
                        // Handle sort option 2
                        true
                    }
                    else -> false
                }
            }

            // Show the popup menu
            popupMenu.show()
        }

    }

    private fun showMetalDialog() {
        val fm = fragmentManager
        val fragmentMetal: DialogFragmentSample = DialogFragmentSample.Companion.newInstance("Some Title")
        fragmentMetal.show(fm!!, "fragment_metal")
    }
}
