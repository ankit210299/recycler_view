package com.example.newapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView: RecyclerView = findViewById(R.id.first_recycler)
        var secondRecyclerView: RecyclerView = findViewById(R.id.second_recycler)
        var thirdRecyclerView: RecyclerView = findViewById(R.id.third_recycler)
        var fourthRecyclerView: RecyclerView = findViewById(R.id.fourth_recycler)
        var fifthRecyclerView: RecyclerView = findViewById(R.id.fifth_recycler)
        firstView(recyclerView)
        secondView(secondRecyclerView)
        thirdView(thirdRecyclerView)
        fourthView(fourthRecyclerView)
        fifthView(fifthRecyclerView)
    }

    fun firstView(recyclerView: RecyclerView) {
        var data = ArrayList<ViewInfo>()
        recyclerView.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        for (i in 1..1) {
            data.add(ViewInfo("Item1", R.drawable.bird))
            data.add(ViewInfo("Item2", R.drawable.cartoon))
            data.add(ViewInfo("Item3", R.drawable.butterfly))
            data.add(ViewInfo("Item4", R.drawable.car))
            data.add(ViewInfo("Item5", R.drawable.cat))
            data.add(ViewInfo("Item6", R.drawable.racingcar))
        }
        val adapter = FirstAdapter(data, this)
        recyclerView.adapter = adapter
    }

    fun secondView(recyclerView: RecyclerView) {
        var data = ArrayList<ViewInfo>()
        recyclerView.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        for (i in 1..1) {
            data.add(ViewInfo("Item1", R.drawable.bird))
            data.add(ViewInfo("Item2", R.drawable.cartoon))
            data.add(ViewInfo("Item3", R.drawable.butterfly))
            data.add(ViewInfo("Item4", R.drawable.car))
            data.add(ViewInfo("Item5", R.drawable.cat))
            data.add(ViewInfo("Item6", R.drawable.racingcar))
        }
        val adapter = FirstAdapter(data, this)
        recyclerView.adapter = adapter
    }

    fun thirdView(recyclerView: RecyclerView) {
        var data = ArrayList<ViewInfo>()
        recyclerView.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        for (i in 1..1) {
            data.add(ViewInfo("Item1", R.drawable.bird))
            data.add(ViewInfo("Item2", R.drawable.cartoon))
            data.add(ViewInfo("Item3", R.drawable.butterfly))
            data.add(ViewInfo("Item4", R.drawable.car))
            data.add(ViewInfo("Item5", R.drawable.cat))
            data.add(ViewInfo("Item6", R.drawable.racingcar))
        }
        val adapter = FirstAdapter(data, this)
        recyclerView.adapter = adapter
    }

    fun fourthView(recyclerView: RecyclerView) {
        var data = ArrayList<ViewInfo>()
        recyclerView.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        for (i in 1..1) {
            data.add(ViewInfo("Item1", R.drawable.bird))
            data.add(ViewInfo("Item2", R.drawable.cartoon))
            data.add(ViewInfo("Item3", R.drawable.butterfly))
            data.add(ViewInfo("Item4", R.drawable.car))
            data.add(ViewInfo("Item5", R.drawable.cat))
            data.add(ViewInfo("Item6", R.drawable.racingcar))
        }
        val adapter = FirstAdapter(data, this)
        recyclerView.adapter = adapter
    }

    fun fifthView(fifthRecyclerView: RecyclerView) {
        var data = ArrayList<ViewInfo>()
        fifthRecyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        for (i in 1..1) {
            data.add(ViewInfo("Item1", R.drawable.bird))
            data.add(ViewInfo("Item2", R.drawable.cartoon))
            data.add(ViewInfo("Item3", R.drawable.butterfly))
            data.add(ViewInfo("Item4", R.drawable.car))
            data.add(ViewInfo("Item5", R.drawable.cat))
            data.add(ViewInfo("Item6", R.drawable.racingcar))
        }
        val adapter = FirstAdapter(data, this)
        fifthRecyclerView.adapter = adapter
    }

}

