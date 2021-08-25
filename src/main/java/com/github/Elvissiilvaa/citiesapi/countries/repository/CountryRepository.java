package com.github.Elvissiilvaa.citiesapi.countries.repository;

import com.github.Elvissiilvaa.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
