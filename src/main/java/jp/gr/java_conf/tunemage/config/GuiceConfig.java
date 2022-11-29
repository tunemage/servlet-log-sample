package jp.gr.java_conf.tunemage.config;

import jp.gr.java_conf.tunemage.servlet.HelloGuiceServlet;

import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

@WebListener
public class GuiceConfig extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(
                new ServletModule() {
                    @Override
                    protected void configureServlets() {
                        serve("/helloGuiceServlet").with(HelloGuiceServlet.class);
                    }
                });
    }
}
