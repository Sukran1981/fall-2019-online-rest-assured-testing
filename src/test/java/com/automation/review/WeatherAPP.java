package com.automation.review;

import java.util.Scanner;

public class WeatherAPP {
    static {

        baseURI = "";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city name: ");
        String city = scanner.nextLine();
        getWOEID(city);
    }

    public static int getWOEID(String city) {
        Response response = given().queryParam("query", city).get("/search").prettyPeek();

    }
public static void printWeatherInfo(String woeid){
        woeid=woeid.replaceAll("\\D","");//to delete all non -digits
    Response response=get("{woeid}",woeid).prettyPeek();

}


}
