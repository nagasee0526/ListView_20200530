package com.ubis.listview_20200530

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubis.listview_20200530.datas.student

class MainActivity : AppCompatActivity() {

    val students = ArrayList<student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        students.add(student(inputname = "이현호", iby = 1981, gneder = true))
        students.add(student(inputname = "김광철", iby = 1966, gneder = true))
        students.add(student(inputname = "김재환", iby = 1993, gneder = true))
        students.add(student(inputname = "박수정", iby = 1994, gneder = false))
        students.add(student(inputname = "엄곤지", iby = 1984, gneder = false))

    }
}
