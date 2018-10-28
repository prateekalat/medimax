package com.dshock.medicalrecordscanner

    import android.os.Bundle
    import android.widget.Toast
    import androidx.appcompat.app.AppCompatActivity
    import kotlinx.android.synthetic.main.activity_camera.*

class CameraActivity : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_camera)

            scan.setOnClickListener {
                camera.captureImage { view, array ->
                    Toast.makeText(this, "Scanned successfully!", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
        }

        override fun onStart() {
            super.onStart()
            camera.onStart()
        }

        override fun onResume() {
            super.onResume()
            camera.onResume()
        }

    override fun onPause() {
        camera.onPause()
        super.onPause()
    }

    override fun onStop() {
        camera.onStop()
        super.onStop()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        camera.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}
