# SimpleJNADemo
A simple application to demonstrate how JNA is used to communicate between C and Java. Written for Linux but may be used as a reference to adapt to other plaforms as well.
Application was written as an example to use in my Medium Article.

## Dependencies
You will need gcc in order to build the project.
```bash
sudo apt-get install build-essentials
```

## Build the TemperatureSampler.c in order to generate the shared object before running the application.
```bash
cd native
make all
```
  
