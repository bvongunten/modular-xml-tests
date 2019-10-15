# modularxml
XML Libraries tests for module based runtime images.

## Projects

Following projects demonstrate the build of a runtime image using jlink with the usage of different XML libraries in a module. To my knowledge, in Oct. 2019 the two well known XML frameworks JAXB (jakarta) and Jackson-XML do not yet fully support the usage in a jlink based runtime image.

### noxml (Runnable: Yes, Runtime Image: Yes)

A simple Hello World module without XML dependencies to test the jlink pom type.

### jackson (Runnable: Yes, Runtime Image: No)

Jackson XML libraries are not yet available as modules. Jlink fails.

### jaxb (Runnable: Yes, Runtime Image: No)

While the jakarta jaxb reference implementation is available as module, the usage/dependency of the jakarta activation-api does prevent the build of a runtime image. JLink fails.

### jaxbhack (Runnable: Yes, Runtime Image: Yes)

Since Sept. 2019 the JAF git repository does contain a module definition. Using this (newer) version as a dependency in the module project does allow a jlink based runtime image.
