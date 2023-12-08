package mna.a4.microservices.user.management.authentication.domain.service;

import mna.a4.microservices.user.management.authentication.common.exception.AppException;
import mna.a4.microservices.user.management.authentication.domain.model.UserAuthenticationPostModel;

public interface UserAuthenticationService {

	public void authenticateUser(UserAuthenticationPostModel userAuthenticationPostModel) throws AppException;
}
