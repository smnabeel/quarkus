package mna.a4.microservices.user.management.authentication.domain.service.impl;

import java.util.Objects;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import mna.a4.microservices.user.management.authentication.common.exception.AppException;
import mna.a4.microservices.user.management.authentication.domain.model.UserAuthenticationPostModel;
import mna.a4.microservices.user.management.authentication.domain.service.UserAuthenticationService;
import mna.a4.microservices.user.management.authentication.infrastructure.otp.model.LanguageModel;
import mna.a4.microservices.user.management.authentication.infrastructure.otp.model.UserOtpPostModel;
import mna.a4.microservices.user.management.authentication.infrastructure.otp.service.OtpApi;

@Singleton
public class UserAuthenticationServiceImpl implements UserAuthenticationService {

	private static final Logger LOG = Logger.getLogger(UserAuthenticationServiceImpl.class);
	
	@Inject
	@RestClient
	private OtpApi otpApiService;
	
	@Override
	public void authenticateUser(UserAuthenticationPostModel userAuthenticationPostModel) throws AppException {
		if (Objects.equals(userAuthenticationPostModel.getUsername(), "1122334455")) {
			LOG.info("User authenticated - " + userAuthenticationPostModel.getUsername());
			
			UserOtpPostModel model = new UserOtpPostModel();
			model.setGenerateOtp(true);
			model.setResendOtp(false);
			otpApiService.postUserOtp("application/json", "application/json", "1122334455", model);
			return;
		} else {
			throw new AppException("Invalid username and password");
		}
	}
}
