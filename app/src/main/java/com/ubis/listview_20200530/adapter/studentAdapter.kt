package com.ubis.listview_20200530.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.ubis.listview_20200530.R
import com.ubis.listview_20200530.datas.student

class studentAdapter(context: Context, resId: Int, list: List<student>) : ArrayAdapter<student>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null ) {
            tempRow = inf.inflate(R.layout.student_sist_item, null)
        }
        val row = tempRow!!

        return row
    }
}