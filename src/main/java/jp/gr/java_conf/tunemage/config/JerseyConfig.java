package jp.gr.java_conf.tunemage.config;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("jp.gr.java_conf.tunemage.resource");
    }
}
