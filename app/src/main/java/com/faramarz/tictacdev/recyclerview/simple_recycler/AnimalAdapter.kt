package com.faramarz.tictacdev.recyclerview.simple_recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.faramarz.tictacdev.recyclerview.R
import kotlinx.android.synthetic.main.item_animal.view.*

class AnimalAdapter(val items: ArrayList<String>, val context: Context, val callback: OnItemClick) : RecyclerView.Adapter<ViewHolder>() {


    override
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_animal, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvAnimalType?.text = items.get(position)
        holder.clickable.setOnClickListener {
            callback.onClick(holder.clickable, position,holder.tvAnimalType.text.toString().trim())
        }
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

}


class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvAnimalType = view.tv_animal_type
    val clickable = view.rootAdapterAnimal
}