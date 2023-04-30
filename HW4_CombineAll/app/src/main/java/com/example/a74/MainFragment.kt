package com.example.a74

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_main, container, false)
        val fragButton = view.findViewById<AppCompatButton>(R.id.frag_btn)
        val fragmentManager = requireActivity().supportFragmentManager
        var onClick = false
        fragButton.setOnClickListener {
            if (onClick) {
                onClick = false
                val transaction = fragmentManager.beginTransaction()
                val frameLayout = requireActivity().supportFragmentManager.findFragmentById(R.id.fragment_content)
                transaction.remove(frameLayout!!).commit()
            }else {
                onClick = true
                val transaction = fragmentManager.beginTransaction()
                transaction.add(R.id.fragment_content,Onefragment()).commit()
            }
        }
        return view
    }
}