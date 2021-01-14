package com.company.teb12;

import com.haulmont.cuba.testsupport.TestContainer;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.ArrayList;
import java.util.Arrays;

public class Teb12TestContainer extends TestContainer {

    public Teb12TestContainer() {
        super();
        //noinspection ArraysAsListWithZeroOrOneArgument
        appComponents = Arrays.asList(
                "com.haulmont.cuba",
                "com.haulmont.addon.maps");
        appPropertiesFiles = Arrays.asList(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the core module
                "com/company/teb12/app.properties",
                // Add this file which is located in CUBA and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "com/company/teb12/test-app.properties");
        autoConfigureDataSource();
    }

    

    public static class Common extends Teb12TestContainer {

        public static final Teb12TestContainer.Common INSTANCE = new Teb12TestContainer.Common();

        private static volatile boolean initialized;

        private Common() {
        }

        @Override
        public void beforeAll(ExtensionContext extensionContext) throws Exception {
            if (!initialized) {
                super.beforeAll(extensionContext);
                initialized = true;
            }
            setupContext();
        }
        

        @SuppressWarnings("RedundantThrows")
        @Override
        public void afterAll(ExtensionContext extensionContext) throws Exception {
            cleanupContext();
            // never stops - do not call super
        }
        
    }
}