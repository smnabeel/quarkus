package mna.a4.microservices.user.management.authentication.presentation;

import io.quarkiverse.openapi.generator.annotations.GeneratedClass;
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import mna.a4.microservices.user.management.authentication.domain.model.LanguageModel;
import mna.a4.microservices.user.management.authentication.domain.model.UserAuthenticationPostModel;

/**
  * API for User Management - User Authentication
  * <p>API for User Management - User Authentication</p>
  */
@Path("/user/management/api/v1/user/{user-id}/authentication")
@GeneratedClass(value="api-spec.yaml", tag = "UserAuthentication")
@ApplicationScoped
public interface UserAuthenticationApi {

    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @GeneratedMethod ("postUserAuthentication")
    public jakarta.ws.rs.core.Response postUserAuthentication(
        @GeneratedParam("Accept") @HeaderParam("Accept") String accept, 
        @GeneratedParam("Accept-Language") @HeaderParam("Accept-Language") LanguageModel acceptLanguage, 
        @GeneratedParam("Content-Type") @HeaderParam("Content-Type") String contentType, 
        @GeneratedParam("user-id") @PathParam("user-id") String userId, 
        UserAuthenticationPostModel userAuthenticationPostModel
    );
}
