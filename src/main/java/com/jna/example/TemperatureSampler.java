package com.jna.example;

public class TemperatureSampler {

    public static void main(String[] args) {
        TemperatureSamplerJnaInterface jnaInterface = TemperatureSamplerJnaInterface.INSTANCE;
        System.out.println("Sampled Temperature = " + jnaInterface.getTemperature());

        TemperatureData temperatureData = jnaInterface.getDetailedTemperature();
        if (temperatureData != null) {
            System.out.println(temperatureData);
        }
    }
}
