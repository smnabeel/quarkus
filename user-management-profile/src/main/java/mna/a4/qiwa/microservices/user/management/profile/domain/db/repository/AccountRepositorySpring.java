package mna.a4.qiwa.microservices.user.management.profile.domain.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mna.a4.qiwa.microservices.user.management.profile.domain.db.entity.Accounts;

@Repository
public interface AccountRepositorySpring extends CrudRepository<Accounts, Long> {

	Accounts findByUsername(String username);
}
