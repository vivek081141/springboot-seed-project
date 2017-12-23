package com.green.countries.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vivek on 23-12-2017.
 */
@Service
public class CountryService {
    private static final Logger LOG = LoggerFactory.getLogger(CountryService.class);
    private static Map<String,Country> countryMap = new HashMap<String,Country>();
    
    public CountryService(){
        populateCountry();
    }

    private void populateCountry() {
        Country country =new Country("1","India","New Delhi","http://img.freeflagicons.com/preview/india.png",50,"ACTIVE");
        countryMap.put("1",country);

        country =new Country("2","AUSTRALIA","CANBERRA","",50,"ACTIVE");
        countryMap.put("2",country);

        country =new Country("3","BANGLADESH","DHAKA","",50,"ACTIVE");
        countryMap.put("3",country);

        country =new Country("4","BELGIUM","BRUSSELS","",50,"ACTIVE");
        countryMap.put("4",country);

        country =new Country("5","CHINA","BEIJING","",50,"ACTIVE");
        countryMap.put("5",country);

        country =new Country("6","DENMARK","COPENHAGEN","",50,"ACTIVE");
        countryMap.put("6",country);

        country =new Country("7","EGYPT","CAIRO","",50,"ACTIVE");
        countryMap.put("7",country);

        country =new Country("8","FRANCE","PARIS","",50,"ACTIVE");
        countryMap.put("8",country);

        country =new Country("9","GREECE","ATHENS","",50,"ACTIVE");
        countryMap.put("9",country);

        country =new Country("10","HUNGARY","BUDAPEST","",50,"ACTIVE");
        countryMap.put("10",country);

        country =new Country("11","NEPAL","KATHMANDU","",50,"ACTIVE");
        countryMap.put("11",country);

    }


    public List<Country> getAllCountries() {
        LOG.info("getAllCountries::Getting all the countries:",countryMap.size());
        return new ArrayList<Country>(countryMap.values());
    }

    public Country create(Country country) {
        LOG.info("create::creating a country:",country==null?null:country.toString());
        if(country==null && country.getId()==null){
            return null;
        }

        if(countryMap.get(country.getId())!=null){
            return null;
        }

        countryMap.put(country.getId(),country);
        return country;
    }

    public Country getCountry(String countryId) {
        LOG.info("getCountry::fetching country for :",countryId);
        return countryMap.get(countryId);
    }
    
    public Country editCountry(Country country){
        LOG.info("editCountry::editing country:",country==null?country:country.toString());
        if(country==null && country.getId()==null){
            return null;
        }

        if(countryMap.get(country.getId())!=null){
            countryMap.put(country.getId(),country);
        }
        return country;
    }
    
    public boolean deleteCountry(String countryId){
        LOG.info("deleteCountry::deleting country:",countryId);
        if(countryId!=null && countryId.length()>0){
            countryMap.remove(countryId);
            return true;
        }
        return false;
    }
}
