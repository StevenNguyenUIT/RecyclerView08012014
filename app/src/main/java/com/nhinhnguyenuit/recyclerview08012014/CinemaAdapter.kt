package com.nhinhnguyenuit.recyclerview08012014

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CinemaAdapter(
    private var context: Context,
    private var listCinema: List<Cinema>

) : RecyclerView.Adapter<CinemaAdapter.CinemaViewHolder>() {

    inner class CinemaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val img = view.findViewById<ImageView>(R.id.image_view_cinema)
        private val txtName = view.findViewById<TextView>(R.id.text_view_name)
        private val txtAddress = view.findViewById<TextView>(R.id.text_view_address)
        private val txtPhone = view.findViewById<TextView>(R.id.text_view_phone)
        private val txtDistance = view.findViewById<TextView>(R.id.text_view_distance)


        init {
            view.setOnClickListener { Log.d("steven", listCinema.getOrNull(adapterPosition)?.name.toString())
            notifyDataSetChanged()
            }
        }

        fun bind(cinema: Cinema){
            img.setImageResource(cinema.image)
            txtName.text = cinema.name
            txtAddress.text = cinema.address
            txtPhone.text = cinema.phone
            txtDistance.text = TextUtils.formatDistance(cinema.distance)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.layout_item_cinema, parent, false)
        return CinemaViewHolder(view)
    }

    override fun getItemCount(): Int = listCinema.size

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {
        holder.bind(listCinema[position])
    }
}