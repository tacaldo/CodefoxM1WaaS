package com.codefoxflashworx.codefoxm1waas

import android.util.Log
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codefoxflashworx.codefoxm1waas.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class JobItemJobRecyclerViewAdapter(
    private val values: List<Job>

) : RecyclerView.Adapter<JobItemJobRecyclerViewAdapter.ViewHolder>() {

    val itemStateArray = SparseBooleanArray()
    var checkCausedByBind = false


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_jobitem, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
//        holder.idView.text = item.jobId.toString()
        holder.jobnameView.text = item.jobName
        holder.contentView.text = item.jobDescription
        //holder.checkBox.isSelected = item.isChecked

        checkCausedByBind = false


        if (!itemStateArray.get(position, false)) {
            checkCausedByBind = true
            holder.checkBox.setChecked(false)
            itemStateArray.put(position, false)


            Log.d("TAG", "holder.checkBox set false in onBindViewHolder at position...$position")

        } else {
            checkCausedByBind = true
            holder.checkBox.setChecked(true)
            itemStateArray.put(position, true)


            Log.d("TAG", "holder.checkBox set true in onBindViewHolder at position...$position")
        }

        checkCausedByBind = false


    }


    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.item_number)
        val jobnameView: TextView = view.findViewById(R.id.job_name)
        val contentView: TextView = view.findViewById(R.id.content)
        val checkBox: CheckBox = view.findViewById(R.id.checkBoxJob)


        init {

            checkBox.setOnCheckedChangeListener { _, isChecked ->
                val currentTimestamp = System.currentTimeMillis()


                val adapterPosition = adapterPosition

                if (checkCausedByBind) {
                    return@setOnCheckedChangeListener
                }


                if (!itemStateArray[adapterPosition, false]) {
                    checkBox.setChecked(true)
                    itemStateArray.put(adapterPosition, true)
                    Log.d(
                        "TAG",
                        "checkBox set true from onclick listener at adapterPosition...$adapterPosition"
                    )

                } else {
                    //mCheckedTextView.setChecked(false)
                    checkBox.setChecked(false)
                    itemStateArray.put(adapterPosition, false)
                    Log.d(
                        "TAG",
                        "checkBox set false from onclick listener at adapterPosition...$adapterPosition"
                    )

                }


            }


        }


    }


}