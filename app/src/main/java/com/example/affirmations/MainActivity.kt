package com.example.affirmations

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView: TextView = findViewById(R.id.textview)
//
//        textView.text = Datasource().loadAffimation().size.toString()

        //Initialize data
        val myDataset = Datasource().loadAffimation()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        
        // 여기가 grid -> 열증가 123
        //                     456 순으로 쌓임
        //recyclerView.layoutManager =GridLayoutManager(this,3)

        // 수평으로 보여주기
        //recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false )
        recyclerView.setHasFixedSize(true)


    }
}