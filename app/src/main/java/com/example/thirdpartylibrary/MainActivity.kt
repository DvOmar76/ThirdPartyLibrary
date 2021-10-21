package com.example.thirdpartylibrary

import `is`.arontibo.library.ProgressDownloadView
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
    {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnDownload.setOnClickListener {

                elastic_download_view.startIntro()

            Handler().postDelayed(Runnable {
                elastic_download_view.success()
            },2*ProgressDownloadView.ANIMATION_DURATION_BASE)
        }
        btnFiler.setOnClickListener {
                elastic_download_view.setProgress(45f)
            Handler().postDelayed(Runnable {
                elastic_download_view.fail()
            },3*ProgressDownloadView.ANIMATION_DURATION_BASE)
            elastic_download_view.fail()
        }
    }


}

