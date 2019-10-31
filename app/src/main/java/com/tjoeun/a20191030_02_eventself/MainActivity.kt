package com.tjoeun.a20191030_02_eventself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            var inputId = idEdt.text.toString()
            var inputPw = pwEdt.text.toString()

//            Toast.makeText(this, String.format("ID : %s, PW : %s", inputId, inputPw), Toast.LENGTH_SHORT).show()

//            val printStr = "ID는 ${inputId}이고 PW는 ${inputPw} 입니다."
//            Toast.makeText(this, printStr, Toast.LENGTH_SHORT).show()

//            JAVA - 예전 버전까지의 코드. 현재도 정석.
//            if (inputId.equals("admin") && inputPw.equals("1234")){
//
//            }

//            JAVA - 1.8 버전 + Kotlin (== 연산자 자체가, 찾아가서 도우)
//            Kotlin에서는 === 연산자도 지원. (JAVA의 ==과 동일한 기능. 포인터 주소 비교는 ===)

            if (inputId == "admin" && inputPw == "1234") {
                Toast.makeText(this, "관리자로 로그인합니다.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "아이디 혹은 비번이 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
