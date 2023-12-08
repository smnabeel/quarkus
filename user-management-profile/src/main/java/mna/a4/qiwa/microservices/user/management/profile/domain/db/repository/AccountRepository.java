package mna.a4.qiwa.microservices.user.management.profile.domain.db.repository;

import org.springframework.data.repository.CrudRepository;

import mna.a4.qiwa.microservices.user.management.profile.domain.db.entity.Accounts;

public interface AccountRepository extends CrudRepository<Accounts, Long> {

	Accounts findByUsername(String username);
}
