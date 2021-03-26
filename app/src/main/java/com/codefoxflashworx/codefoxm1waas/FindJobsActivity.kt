package com.codefoxflashworx.codefoxm1waas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.util.Log

class FindJobsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var viewAdapter: RecyclerView.Adapter<*>
    private var viewManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_find_jobs)
        setContentView(R.layout.fragment_jobitem_list)

//        var jobs = DataManager.initializeJobs2()

//        viewManager = LinearLayoutManager(this)
//        viewAdapter = JobItemJobRecyclerViewAdapter(jobs)

        recyclerView = findViewById<RecyclerView>(R.id.jobs_recycle_view).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter

        }


    }

    init {

        var jobs = DataManager.initializeJobs()

        viewManager = LinearLayoutManager(this)
        viewAdapter = JobItemJobRecyclerViewAdapter(jobs)

        // val checkBox: CheckBox = view.findViewById(R.id.checkbox)

        //val checkBox: CheckBox = recyclerView.findViewById(R.id.checkBoxJob)


        println("First initializer block that prints...")

    }

    fun onFindJobsCheckBoxClick(view: View) {
        // Do something in response to button
        val currentTimestamp = System.currentTimeMillis()
        Log.d("TAG", "message reached it at...$currentTimestamp")
    }

}