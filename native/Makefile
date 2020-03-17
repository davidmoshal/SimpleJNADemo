all:
	mkdir -p out
	( cd src; gcc -c -Wall -Werror -fpic TemperatureSampler.c; )
	( cd src; gcc -shared -o libtemperaturesampler.so TemperatureSampler.o; )
	mv src/*.so src/*.o out


clean:
	rm -rf out
