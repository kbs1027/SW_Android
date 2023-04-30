package com.example.a74

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SubFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sub, container, false)
        val datas = mutableListOf<String>()
        for (i in 1 .. 20){datas.add("Item $i")}
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = MyAdapter(datas)
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                requireContext(), LinearLayoutManager.VERTICAL)
        )
        return view
    }
}