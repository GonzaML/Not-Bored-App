package com.example.notbored.RecyclerView

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.notbored.Type
import com.example.notbored.databinding.TypeTextItemBinding

class ActivitiesViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun render(typeList: Type) {
        val binding = TypeTextItemBinding.bind(view)
        binding.tvType.text = typeList.type
    }
}
