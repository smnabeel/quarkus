package mna.a4.qiwa.microservices.user.management.profile.application;

import org.jboss.logging.Logger;

import jakarta.ws.rs.core.Response;
import mna.a4.qiwa.microservices.user.management.profile.domain.db.entity.Accounts;
import mna.a4.qiwa.microservices.user.management.profile.domain.db.repository.AccountRepository;
import mna.a4.qiwa.microservices.user.management.profile.domain.db.repository.AccountRepositorySpring;
import mna.a4.qiwa.microservices.user.management.profile.domain.model.UserProfileInfoModel;
import mna.a4.qiwa.microservices.user.management.profile.presentation.UserProfileApi;

public class UserProfileApiImpl implements UserProfileApi {

	private static final Logger LOG = Logger.getLogger(UserProfileApiImpl.class);

	private final AccountRepository accountRepository;
	private final AccountRepositorySpring accountRepositorySpring;

	public UserProfileApiImpl(AccountRepository accountRepository, AccountRepositorySpring accountRepositorySpring) {
		this.accountRepository = accountRepository;
		this.accountRepositorySpring = accountRepositorySpring;
	}
	
	@Override
	public Response getUserProfileInformation(String accept, String userId) {
		LOG.info("Invoking the Quarkus repository...");
		Accounts accounts = accountRepository.findByUsername("qiwa-user");
		LOG.info("User account ID: " + accounts.getUserId());
		
		LOG.info("Invoking the Spring repository...");
		Accounts accounts1 = accountRepositorySpring.findByUsername("qiwa-user-2");
		LOG.info("User account ID: " + accounts1.getUserId());
		
		LOG.info("Invoking domain service...");
		try {
			UserProfileInfoModel model = new UserProfileInfoModel();
			model.setUserId(userId);
			model.setDob("01-JAN-1971");
			model.setMobileNumber("0598765432");
			//model.set();
			return Response
					.ok(model)
					.build();
		} catch (Exception exception) {
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build();
		}
	}

}
