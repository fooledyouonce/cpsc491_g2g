package com.example.got2go.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.got2go.R

class MapFragment  //TODO: update fragment w/g2g stuff
    : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnMetal: ImageButton = view.findViewById(R.id.btnMetal)
        btnMetal.setOnClickListener(View.OnClickListener { showMetalDialog() })
    }

    private fun showMetalDialog() {
        val fm = fragmentManager
        val fragmentMetal: DialogFragmentSample = DialogFragmentSample.Companion.newInstance("Some Title")
        fragmentMetal.show(fm!!, "fragment_metal")
    }
}
