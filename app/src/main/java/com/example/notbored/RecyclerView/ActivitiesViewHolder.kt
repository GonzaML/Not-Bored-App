package com.example.notbored.RecyclerView

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.notbored.databinding.TypeTextItemBinding
import com.example.notbored.retroFit.ActivityResponse

class ActivitiesViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun render(typeList: ActivityResponse) {
        val binding = TypeTextItemBinding.bind(view)
        binding.tvType.text = typeList.type
    }
}
