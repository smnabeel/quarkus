package mna.a4.microservices.general.notification.otp.common.service;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import io.quarkus.runtime.StartupEvent;
import io.vertx.ext.consul.ConsulClientOptions;
import io.vertx.ext.consul.ServiceOptions;
import io.vertx.mutiny.core.Vertx;
import io.vertx.mutiny.ext.consul.ConsulClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class Registration {

	private static final Logger LOG = Logger.getLogger(Registration.class);
	
	@ConfigProperty(name = "consul.host") String consulHost;
    @ConfigProperty(name = "consul.port") int consulPort;

    @ConfigProperty(name = "quarkus.http.port") int port;

	public void init(@Observes StartupEvent ev, Vertx vertx) {
        ConsulClient client = ConsulClient.create(vertx, new ConsulClientOptions().setHost(consulHost).setPort(consulPort));
        LOG.info("***** Printing: " + port);
        client.registerServiceAndAwait(
                new ServiceOptions().setPort(port).setAddress("localhost").setName("otp-service").setId("otp-service-" + port));
    }
}
