package com.serafine.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderGrid(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_grid, parent, false)) {
    private var imgView: ImageView? = null
    private var txtName: TextView? = null
    private var txtRole: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_item_photo)
        txtName = itemView.findViewById(R.id.tv_item_name)
        txtRole = itemView.findViewById(R.id.tv_item_role)
    }

    fun bind(data : Agent){
        imgView?.setImageResource(data.photo!!)
        txtName?.setText(data.name)
        txtRole?.setText(data.role)
    }
}