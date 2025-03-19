//write a class
//1. declare 10 properties
//2. override the toString(), hashCode(), constructor, getter() and setter()
//        3. assign a values using the setter
//4. display the values using the getter
package com.xworkz;

import java.util.Objects;

public class City {
    private String name;
    private String state;
    private String country;
    private int population;
    private double area;
    private String mayor;
    private int postalCode;
    private String timeZone;
    private boolean isCapital;
    private double gdp;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", mayor='" + mayor + '\'' +
                ", postalCode=" + postalCode +
                ", timeZone='" + timeZone + '\'' +
                ", isCapital=" + isCapital +
                ", gdp=" + gdp +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state, country, population, area, mayor, postalCode, timeZone, isCapital, gdp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    //constructer

    public City() {
        System.out.println("Running in no arg constructer");
    }
}
