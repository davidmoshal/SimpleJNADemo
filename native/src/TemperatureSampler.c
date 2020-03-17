#include <stdio.h>
#include <string.h>

struct DetailedTemperature {
    char timestamp[128];
    float temperature;
    char scale[16];
};

float getTemperature() {
    setvbuf(stdout, NULL, _IONBF, 0);
    printf("%s\n","Returning Simple Temperature...");
    return 27.8;
}

struct DetailedTemperature getDetailedTemperature() {
    setvbuf(stdout, NULL, _IONBF, 0);
    struct DetailedTemperature detailedTemperature;

    strcpy(detailedTemperature.timestamp, "02-03-2020 17:30:48");
    detailedTemperature.temperature = 27.8;
    strcpy(detailedTemperature.scale, "CELCIUS");

    printf("%s\n","Returning Detailed Temperature...");
    return detailedTemperature;
}
