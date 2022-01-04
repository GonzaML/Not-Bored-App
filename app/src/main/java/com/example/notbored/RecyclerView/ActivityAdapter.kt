package com.example.notbored

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notbored.RecyclerView.ActivitiesViewHolder

class ActivityAdapter(private val typeList: List<Type>) : RecyclerView.Adapter<ActivitiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivitiesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ActivitiesViewHolder(layoutInflater.inflate(R.layout.type_text_item, parent, false))
    }

    override fun onBindViewHolder(holder: ActivitiesViewHolder, position: Int) {

        holder.render(typeList[position])
    }

    override fun getItemCount() = typeList.size


    }
