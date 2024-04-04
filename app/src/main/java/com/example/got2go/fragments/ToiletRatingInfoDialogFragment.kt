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

        //onClickListener for view written reviews button
        viewWrittenBtn.setOnClickListener {
            // Add view written reviews button functionality here
            Log.d("ToiletRatingInfoDialogFragment", "View written reviews button clicked")
        }

        return view
    }
}
