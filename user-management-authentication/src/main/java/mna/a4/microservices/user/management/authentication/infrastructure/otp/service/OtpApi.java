package mna.a4.microservices.user.management.authentication.infrastructure.otp.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import mna.a4.microservices.user.management.authentication.infrastructure.otp.model.LanguageModel;
import mna.a4.microservices.user.management.authentication.infrastructure.otp.model.UserOtpPatchModel;
import mna.a4.microservices.user.management.authentication.infrastructure.otp.model.UserOtpPostModel;

/**
  * API for General Service - OTP Generation & Verification
  * <p>API for General Service - OTP Generation & Verification</p>
  */
@Path("/general/api/v1/user/{user-id}")
//@RegisterRestClient(configKey="otp-service")
@RegisterRestClient(baseUri = "stork://otp-service")
@ApplicationScoped
public interface OtpApi {

    @PATCH
    @Path("/otp/{otp-id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @GeneratedMethod ("patchUserOtp")
    public jakarta.ws.rs.core.Response patchUserOtp(
        @GeneratedParam("Accept") @HeaderParam("Accept") String accept, 
        //@GeneratedParam("Accept-Language") @HeaderParam("Accept-Language") LanguageModel acceptLanguage, 
        @GeneratedParam("Content-Type") @HeaderParam("Content-Type") String contentType, 
        @GeneratedParam("user-id") @PathParam("user-id") String userId, 
        @GeneratedParam("otp-id") @PathParam("otp-id") String otpId, 
        UserOtpPatchModel userOtpPatchModel
    );

    @POST
    @Path("/otp")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @GeneratedMethod ("postUserOtp")
    public jakarta.ws.rs.core.Response postUserOtp(
      	@GeneratedParam("Accept") @HeaderParam("Accept") String accept, 
        //@GeneratedParam("Accept-Language") @HeaderParam("Accept-Language") LanguageModel acceptLanguage, 
        @GeneratedParam("Content-Type") @HeaderParam("Content-Type") String contentType, 
        @GeneratedParam("user-id") @PathParam("user-id") String userId, 
        UserOtpPostModel userOtpPostModel
    );

}
