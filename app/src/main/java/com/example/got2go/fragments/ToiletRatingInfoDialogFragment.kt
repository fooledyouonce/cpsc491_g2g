package com.example.got2go.fragments

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.DialogFragment
import com.example.got2go.R
import android.util.Log
import androidx.navigation.fragment.findNavController


class ToiletRatingInfoDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        //inflate
        val view = inflater.inflate(R.layout.fragment_toilet_rating_info, container, false)


        val bookmarkBtn = view.findViewById<ImageButton>(R.id.bookmarkBtn)
        val viewWrittenBtn = view.findViewById<Button>(R.id.viewWrittenBtn)

        //onClickListener for bookmark button
        bookmarkBtn.setOnClickListener {
            //bookmark button functionality here
            Log.d("ToiletRatingInfoDialogFragment", "Bookmark button clicked")
        }

        // Inside ToiletRatingInfoDialogFragment
        viewWrittenBtn.setOnClickListener {
            findNavController().navigate(R.id.action_to_location_reviews)
        }

        return view
    }
}
