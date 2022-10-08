package com.example.listviewcustomadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.teacher_block.view.*

class TeacherAdapter : BaseAdapter() {
    val teachersList = arrayListOf(
        Teacher("Anant", "CPP"),
        Teacher("Ayan", "Java"),
        Teacher("Avik", "JS")
    )
    override fun getCount(): Int {
        return teachersList.size
    }

    override fun getItem(position: Int): Teacher {
        return teachersList[position]
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView = LayoutInflater.from(parent?.context).inflate(
            R.layout.activity_main,
            parent,
            false
        )

        val tvName = itemView.teacher_name
        val tvSubject = itemView.teacher_subject
        tvName.text = getItem(position).Name
        tvSubject.text = getItem(position).Subject
        return itemView
    }
}