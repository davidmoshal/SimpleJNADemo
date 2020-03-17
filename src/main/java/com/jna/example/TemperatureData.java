package com.jna.example;

import com.sun.jna.Native;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class TemperatureData extends Structure implements Structure.ByValue {
    public byte[] timestamp = new byte[128];
    public float temperature;
    public byte[] scale = new byte[16];

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("timestamp", "temperature", "scale");
    }

    @Override
    public String toString() {
        return String.format("Timestamp = %s\nTemperature = %f\nScale = %s", Native.toString(timestamp), temperature, Native.toString(scale));
    }
}
