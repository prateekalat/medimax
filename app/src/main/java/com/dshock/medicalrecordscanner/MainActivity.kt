package com.dshock.medicalrecordscanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        records.apply {
            setHasFixedSize(true)
            adapter = RecordAdapter(this@MainActivity)
            layoutManager = LinearLayoutManager(context)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item?.itemId) {
            R.id.scan -> {
                val intent = Intent(this, CameraActivity::class.java)
                startActivity(intent)
            }

            R.id.add_manually -> {
                val intent = Intent(this, AddRecordActivity::class.java)
                startActivity(intent)
            }
        }

        return true
    }
}
