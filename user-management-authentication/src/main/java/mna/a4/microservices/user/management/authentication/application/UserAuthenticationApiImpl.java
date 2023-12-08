package mna.a4.microservices.user.management.authentication.application;

import org.jboss.logging.Logger;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import mna.a4.microservices.user.management.authentication.common.exception.AppException;
import mna.a4.microservices.user.management.authentication.domain.model.LanguageModel;
import mna.a4.microservices.user.management.authentication.domain.model.UserAuthenticationPostModel;
import mna.a4.microservices.user.management.authentication.domain.service.UserAuthenticationService;
import mna.a4.microservices.user.management.authentication.presentation.UserAuthenticationApi;

public class UserAuthenticationApiImpl implements UserAuthenticationApi {

	private static final Logger LOG = Logger.getLogger(UserAuthenticationApiImpl.class);

	@Inject
	private UserAuthenticationService userAuthenticationService;
	
	@Override
	public Response postUserAuthentication(String accept, LanguageModel acceptLanguage, String contentType,
			String userId, UserAuthenticationPostModel userAuthenticationPostModel) {
		LOG.info("Invoking domain service...");
		try {
			userAuthenticationService.authenticateUser(userAuthenticationPostModel);
			return Response
					.status(Response.Status.CREATED)
					.build();
		} catch (AppException appException) {
			LOG.error(appException.getMessage(), appException);
			return Response
					.status(Response.Status.CONFLICT)
					.build();
		} catch (Exception exception) {
			LOG.error(exception.getMessage(), exception);
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build();
		}
	}
}
