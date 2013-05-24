package eu.pmsoft.testkata.testngguice.impl.controller;

import com.google.inject.AbstractModule;
import eu.pmsoft.testkata.testngguice.api.OrganizationControlEndpoint;
import eu.pmsoft.testkata.testngguice.api.UserControlEndpoint;

public class ControllerLayerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(OrganizationControlEndpoint.class).to(OrganizationController.class);
        bind(UserControlEndpoint.class).to(UserController.class);
    }
}
