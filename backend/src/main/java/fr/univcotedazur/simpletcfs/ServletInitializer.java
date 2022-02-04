package fr.univcotedazur.simpletcfs;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// For deployment on external tomcat server (springBoot provides an embedded tomcat by default)
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SimpleTcfsServer.class);
    }

}
