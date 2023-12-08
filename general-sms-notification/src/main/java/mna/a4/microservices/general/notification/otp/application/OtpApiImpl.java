package mna.a4.microservices.general.notification.otp.application;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import mna.a4.microservices.general.notification.otp.domain.model.UserOtpPatchModel;
import mna.a4.microservices.general.notification.otp.domain.model.UserOtpPostModel;
import mna.a4.microservices.general.notification.otp.infrastructure.userprofile.model.UserProfileInfoModel;
import mna.a4.microservices.general.notification.otp.infrastructure.userprofile.service.UserProfileApi;
import mna.a4.microservices.general.notification.otp.presentation.OtpApi;

public class OtpApiImpl implements OtpApi {

	private static final Logger LOG = Logger.getLogger(OtpApiImpl.class);

	@Inject
	@RestClient
	private UserProfileApi userProfileApiService;
	
	@Override
	public Response patchUserOtp(String accept, /*LanguageModel acceptLanguage,*/ String contentType, String userId, String otpId, UserOtpPatchModel userOtpPatchModel) {
		LOG.info("Invoking domain service...");
		try {
			return Response
					.status(Response.Status.NO_CONTENT)
					.build();
//		} catch (AppException appException) {
//			return Response
//					.status(Response.Status.CONFLICT)
//					.build();
		} catch (Exception exception) {
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build();
		}
	}

	@Override
	public Response postUserOtp(String accept, /*LanguageModel acceptLanguage,*/ String contentType, String userId, UserOtpPostModel userOtpPostModel) {
		LOG.info("Invoking domain service...");
		try {
			UserProfileInfoModel model = userProfileApiService.getUserProfileInformation("application/json", "1122334455")
					.readEntity(UserProfileInfoModel.class);
			LOG.info("Sending OTP on mobile number: " + model.getMobileNumber());
			return Response
					.status(Response.Status.CREATED)
					.build();
//		} catch (AppException appException) {
//			return Response
//					.status(Response.Status.CONFLICT)
//					.build();
		} catch (Exception exception) {
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build();
		}
	}

}
