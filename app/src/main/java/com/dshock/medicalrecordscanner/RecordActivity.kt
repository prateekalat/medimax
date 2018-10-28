package com.dshock.medicalrecordscanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.android.synthetic.main.activity_record.*

class RecordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)

        val entries = mutableListOf(
                Entry(0f, 4f),
                Entry(1f, 2f),
                Entry(2f, 5f),
                Entry(3f, 1f)
        )

        val dataSet = LineDataSet(entries, "Blood Pressure")
        val data = LineData(dataSet)
        chart.data = data
    }
}
