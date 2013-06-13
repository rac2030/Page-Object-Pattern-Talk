/*
 * Copyleft (c) 2012. This code is for learning purposes only. Do whatever you like with it but don't take it as perfect code.
 * This code lab has been developed by Michel Racic (http://rac.su/+) and funded partially by Credit Suisse AG (http://www.credit-suisse.ch) and GDG Zürich (http://www.gdgzh.ch).
 */

package ch.racic.selenium.poptalk.calc.utils;

import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class POConfig {

    private Properties props = new Properties();

    public POConfig() throws IOException {
        InputStream in = getClass().getResourceAsStream("/ch/racic/selenium/poptalk/calc/testconfig.properties");
        try {
            props.load(in);
        } finally {
            in.close();
        }
    }

    public POConfig(String configName) throws IOException {
        InputStream in = getClass().getResourceAsStream("/ch/racic/selenium/poptalk/calc/" + configName + ".properties");
        try {
            props.load(in);
        } finally {
            in.close();
        }

    }

    public <T> Class getPageObjectImplementation(WebDriver driver, Class<T> pageInterfaceToProxy) throws Exception {
        // Use reflections to load the given class
        ClassLoader classLoader = POConfig.class.getClassLoader();
        Class impl = classLoader.loadClass(props.getProperty(pageInterfaceToProxy.getSimpleName()));

        return impl;
    }

    public String getProperty(String propertyName) {
        return props.getProperty(propertyName);
    }

}
