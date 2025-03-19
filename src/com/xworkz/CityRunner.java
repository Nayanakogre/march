package com.xworkz;

public class CityRunner {
    public static void main(String[] args) {

                City city = new City();

                city.setName("Bengaluru");
                city.setState("Karnataka");
                city.setCountry("India");
                city.setPopulation(13000000);
                city.setArea(741.0);
                city.setMayor("Nandhessh");
                city.setPostalCode(560001);
                city.setTimeZone("IST");
                city.setCapital(true);
                city.setGdp(110.5);

                System.out.println(city.getName());
                System.out.println(city.getState());
                System.out.println(city.getCountry());
                System.out.println(city.getPopulation());
                System.out.println(city.getArea());
                System.out.println(city.getMayor());
                System.out.println(city.getPostalCode());
                System.out.println(city.getTimeZone());
                System.out.println(city.isCapital());
                System.out.println(city.getGdp());
                System.out.println(city);
            }
        }



