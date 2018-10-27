package com.dshock.medicalrecordscanner

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecordAdapter : RecyclerView.Adapter<RecordAdapter.ViewHolder>() {

    private val records = listOf(
            Record(
                    "Blood Test",
                    "10:00 AM",
                    ""
            )
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.listitem_record, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = records.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(record = records[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val recordImage: ImageView = itemView.findViewById(R.id.recordImage)
        private val recordName: TextView = itemView.findViewById(R.id.recordName)
        private val recordTime: TextView = itemView.findViewById(R.id.recordTime)

        fun bind(record: Record) {
            recordName.text = record.name
            recordTime.text = record.time
        }
    }
}