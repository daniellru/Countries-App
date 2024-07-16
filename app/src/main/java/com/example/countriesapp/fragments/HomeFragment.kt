package com.example.countriesapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.countriesapp.R
import com.example.countriesapp.adapter.CountryAdapter
import com.example.countriesapp.databinding.FragmentHomeBinding
import com.example.countriesapp.model.Countries

class HomeFragment : Fragment() {

    private var homeBinding: FragmentHomeBinding? = null
    private val dinging get() = homeBinding!!

    private lateinit var countryAdapter: CountryAdapter
    private val countryList = Countries.getAllCountries()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeBinding = FragmentHomeBinding.inflate(inflater,container,false)
        return homeBinding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()

    }

    private fun setupRecyclerView(){
        countryAdapter = CountryAdapter(countryList, this)
        homeBinding?.rvHome?.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = countryAdapter
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        homeBinding = null
    }

}