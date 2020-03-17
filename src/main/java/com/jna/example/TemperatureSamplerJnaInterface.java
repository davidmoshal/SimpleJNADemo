package com.jna.example;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface TemperatureSamplerJnaInterface extends Library {
    TemperatureSamplerJnaInterface INSTANCE = (TemperatureSamplerJnaInterface) Native.load(System.getProperty("user.dir") + "/native/out/libtemperaturesampler.so", TemperatureSamplerJnaInterface.class);

    float getTemperature();
    TemperatureData getDetailedTemperature();
}
