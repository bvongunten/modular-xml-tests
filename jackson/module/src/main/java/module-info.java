module helloworld.jaxb {
    requires transitive com.fasterxml.jackson.core;
    requires transitive com.fasterxml.jackson.dataformat.xml;

    exports ch.nostromo.modularxml;
}