package com.example.countriesapp.model

import com.example.countriesapp.R

object Countries {

    fun getAllCountries(): MutableList<Country>{

        val list = mutableListOf<Country>()

        list.add(
            Country(R.drawable.brazil,
                "Brazil",
                "Language: Portuguese",
                "Capital: Brasilia",
                "Population: 217.666.431",
                "Brazil has the largest economy in Latin America and the Southern Hemisphere. It is an upper-middle income developing mixed economy and the 8th largest in the world by GDP as of 2024. Brazil is also a major industrial power and ranks among the top countries globally by the number of billionaires."
                )
        )

        list.add(
            Country(R.drawable.ethiopia,
                "Ethiopia",
                "Language: Amharic",
                "Capital: Addis Ababa",
                "Population: 129.719.719",
                "Ethiopia has one of the fastest-growing economies in Africa. It is largely based on agriculture, which employs the majority of the population. The country is focusing on industrialization and infrastructure development to boost economic growth and reduce poverty."
            )
        )

        list.add(
            Country(R.drawable.france,
                "France",
                "Language: French",
                "Capital: Paris",
                "Population: 68.373.433",
                "France has the third-largest economy in Europe and is one of the world's leading industrial powers. It has a diverse economy with key sectors including manufacturing, services, and tourism. France is also a major exporter and an influential member of the European Union."
            )
        )

        list.add(
            Country(R.drawable.germany,
                "Germany",
                "Language: German",
                "Capital: Berlin",
                "Population: 84.669.326",
                "Germany has the largest economy in Europe and the fourth-largest in the world. It is a global leader in industrial production, particularly in automotive, engineering, and chemical sectors. Germany is also a major exporter and a key member of the European Union."
            )
        )

        list.add(
            Country(R.drawable.south_korea,
                "South Korea",
                "Language: Korean",
                "Capital: Seoul",
                "Population: 52.081.799",
                "South Korea has the 10th-largest economy in the world. It is a high-tech, industrialized nation known for its advanced electronics, automotive, and shipbuilding industries. South Korea is also a major exporter and has a strong emphasis on innovation and technology."
            )
        )

        list.add(
            Country(R.drawable.sweden,
                "Sweden",
                "Language: Swedish",
                "Capital: Stockholm",
                "Population: 10,676,015",
                "Sweden has a highly developed and diverse economy, known for its strong welfare system and high standard of living. It excels in sectors like manufacturing, technology, and green energy. Sweden is also a major exporter and has a robust innovation-driven economy."
            )
        )

        return list
    }


}