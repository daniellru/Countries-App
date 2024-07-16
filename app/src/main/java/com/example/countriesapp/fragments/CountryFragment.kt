package com.example.countriesapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.countriesapp.R
import com.example.countriesapp.databinding.CountryItemBinding
import com.example.countriesapp.databinding.FragmentCountryBinding
import com.example.countriesapp.model.Countries


class CountryFragment : Fragment() {

    private val args: CountryFragmentArgs by navArgs()

    private var countryBinding: FragmentCountryBinding? = null
    private val binding get() = countryBinding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        countryBinding = FragmentCountryBinding.inflate(inflater,container,false)
        return countryBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgFlagCountry.setImageResource(args.country.flag)
        binding.tvCountryName.text = args.country.name
        binding.tvLanguage.text = args.country.language
        binding.tvPopulation.text = args.country.population
        binding.tvCapital.text = args.country.capital
        binding.tvEconomy.text = args.country.economy
    }


}