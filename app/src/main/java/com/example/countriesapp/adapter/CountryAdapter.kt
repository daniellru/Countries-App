package com.example.countriesapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.countriesapp.databinding.CountryItemBinding
import com.example.countriesapp.fragments.HomeFragmentDirections
import com.example.countriesapp.model.Country

class CountryAdapter(private val list: MutableList<Country>,
                     private val fragment: Fragment): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    inner class CountryViewHolder(val itemBinding: CountryItemBinding):RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
       val itemBinding = CountryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CountryViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val currentItem = list[position]
        holder.itemBinding.imgFlag.setImageResource(currentItem.flag)
        holder.itemBinding.tvCountry.text = currentItem.name
        holder.itemView.setOnClickListener{
           val action = HomeFragmentDirections.actionHomeFragmentToCountryFragment(currentItem)
            fragment.findNavController().navigate(action)

        }
    }

}