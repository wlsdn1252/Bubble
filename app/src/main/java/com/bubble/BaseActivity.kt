package com.bubble

import android.content.Intent
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.custom_actionbar.*

open class BaseActivity : AppCompatActivity() {

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

    // 액션바의 프로필사진 클릭하면 상세프로필ㄹ 액티비티로 이동
    fun goToCustomProfileImage(){
        customProfileImage.setOnClickListener {
            val myIntent = Intent(this, ProfileInformation :: class.java)
            startActivity(myIntent)
            finish()
        }
    }
}