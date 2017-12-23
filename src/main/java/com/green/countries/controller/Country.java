package com.green.countries.controller;

/**
 * Created by Vivek on 23-12-2017.
 */
public class Country {

    private String id;
    private String name;
    private String city;
    private String mapLink;
    private Integer greenIndex;
    private String status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMapLink() {
        return mapLink;
    }

    public void setMapLink(String mapLink) {
        this.mapLink = mapLink;
    }

    public Integer getGreenIndex() {
        return greenIndex;
    }

    public void setGreenIndex(Integer greenIndex) {
        this.greenIndex = greenIndex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Country(String id, String name, String city, String mapLink, Integer greenIndex, String status) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.mapLink = mapLink;
        this.greenIndex = greenIndex;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", mapLink='" + mapLink + '\'' +
                ", greenIndex=" + greenIndex +
                ", status='" + status + '\'' +
                '}';
    }
}
