package com.green.countries.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Vivek Agrawal
 */
@RestController
@Api(value = "Country", description = "Country Api")
@RequestMapping("/country")
class CountryController {

    @Autowired
    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @ApiOperation(value = "View list of countries")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @ApiOperation(value = "Create Country")
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Country createCountry(@Valid @RequestBody Country country) {
        return countryService.create(country);
    }

    @ApiOperation(value = "edit Country")
    @RequestMapping(value = "/edit/", method = RequestMethod.PUT)
    public Country editCountry(@Valid @RequestBody Country country) {
        return countryService.editCountry(country);
    }

    @RequestMapping(value = "/get/{countryId}", method = RequestMethod.GET)
    public Country getCountry(@PathVariable String countryId) {
        return countryService.getCountry(countryId);
    }

    @ApiOperation(value = "delete Country")
    @RequestMapping(value = "/delete/{countryId}", method = RequestMethod.PUT)
    public boolean deleteCountry(@PathVariable String countryId){
        return countryService.deleteCountry(countryId);
    }

}
