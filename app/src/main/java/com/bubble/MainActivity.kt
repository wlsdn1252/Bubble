package com.bubble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.custom_actionbar.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getCustomBar()

        customBarSearchImageView.setOnClickListener {
            Toast.makeText(this, "클릭됨", Toast.LENGTH_SHORT).show()
        }

    }


    fun getCustomBar(){
        // 1.기본액션바 불러내기
        val defaultActionBar = supportActionBar!!

        // 액션바 모드를 커스텀 지원으로 설정
        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

        // 어떤 커스텀뷰를 설정할건지 설정
        defaultActionBar.setCustomView(R.layout.custom_actionbar)

        // 커스텀뷰를 들고있는 툴바 저장
        val toolbar = defaultActionBar.customView.parent as Toolbar

        // 액션바의 여백 설정 여부
        toolbar.setContentInsetsAbsolute(0,0)
    }
}