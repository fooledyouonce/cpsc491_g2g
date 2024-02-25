package com.example.got2go.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.got2go.R

class WikiFragment  //TODO: update fragment w/g2g stuff
    : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_wiki, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnPaper: ImageButton = view.findViewById(R.id.btnPaper)
        var btnPlastic: ImageButton = view.findViewById(R.id.btnPlastic)
        var btnGlass: ImageButton = view.findViewById(R.id.btnGlass)
        var btnMetal: ImageButton = view.findViewById(R.id.btnMetal)
        btnPaper.setOnClickListener(View.OnClickListener { showPaperDialog() })
        btnPlastic.setOnClickListener(View.OnClickListener { showPlasticDialog() })
        btnGlass.setOnClickListener(View.OnClickListener { showGlassDialog() })
        btnMetal.setOnClickListener(View.OnClickListener { showMetalDialog() })
    }

    private fun showMetalDialog() {
        val fm = fragmentManager
        val fragmentMetal: Fragment2 = Fragment2.Companion.newInstance("Some Title")
        fragmentMetal.show(fm!!, "fragment_metal")
    }

    private fun showGlassDialog() {
        val fm = fragmentManager
        val fragmentGlass: Fragment1 = Fragment1.Companion.newInstance("Some Title")
        fragmentGlass.show(fm!!, "fragment_glass")
    }

    private fun showPlasticDialog() {
        val fm = fragmentManager
        val fragmentPlastic: Fragment4 = Fragment4.Companion.newInstance("Some Title")
        fragmentPlastic.show(fm!!, "fragment_plastic")
    }

    private fun showPaperDialog() {
        val fm = fragmentManager
        val fragmentPaper: Fragment3 = Fragment3.Companion.newInstance("Some Title")
        fragmentPaper.show(fm!!, "fragment_paper")
    }
}
