package mna.a4.qiwa.microservices.user.management.profile.presentation;

import io.quarkiverse.openapi.generator.annotations.GeneratedClass;
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

/**
  * API for User Management - User Profile Information
  * <p>API for User Management - User Profile Information</p>
  */
@Path("/user/management/api/v1/user/{user-id}")
@GeneratedClass(value="api-spec.yaml", tag = "UserProfile")
@ApplicationScoped
public interface UserProfileApi {

    @GET
	@Path("/profile")
    @Produces({"application/json"})
    @GeneratedMethod ("getUserProfileInformation")
    public jakarta.ws.rs.core.Response getUserProfileInformation(
        @GeneratedParam("Accept") @HeaderParam("Accept") String accept, 
//        @GeneratedParam("Accept-Language") @HeaderParam("Accept-Language") LanguageModel acceptLanguage, 
        @GeneratedParam("user-id") @PathParam("user-id") String userId
    );

}
