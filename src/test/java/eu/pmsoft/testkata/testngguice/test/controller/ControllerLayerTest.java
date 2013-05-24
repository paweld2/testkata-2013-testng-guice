package eu.pmsoft.testkata.testngguice.test.controller;

import eu.pmsoft.testkata.testngguice.api.OrganizationControlEndpoint;
import eu.pmsoft.testkata.testngguice.api.UserControlEndpoint;
import eu.pmsoft.testkata.testngguice.impl.controller.ControllerLayerModule;
import org.junit.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

@Guice(modules = {ControllerLayerModule.class})
public class ControllerLayerTest {

    @Inject
    private OrganizationControlEndpoint organizationControlEndpoint;

    @Inject
    private UserControlEndpoint userControlEndpoint;


    @Test
    public void testEndpointsAreInjected(){
         Assert.assertNotNull(organizationControlEndpoint);
         Assert.assertNotNull(userControlEndpoint);
    }


}
