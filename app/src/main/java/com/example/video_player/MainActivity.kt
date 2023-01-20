package com.example.video_player

import android.net.Uri
import android.net.Uri.*
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.video_player.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val videoView = findViewById<VideoView>(R.id.videoV)

        //Creating mediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        //Specify the locate of video file
        val uri: Uri = parse(
            "android.resource://" + packageName + "/" + "videoplay.mp4"
        )

        //Setting MediaController and UIR, the starting the videoView
        videoView.setMediaController(mediaController)
        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.videoplay)
        videoView.requestFocus()
        //videoView.start()

    }
}