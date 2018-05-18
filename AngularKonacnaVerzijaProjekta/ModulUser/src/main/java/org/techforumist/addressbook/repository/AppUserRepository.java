package org.techforumist.addressbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techforumist.addressbook.domain.AppUser;




public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findOneByUsername(String username);
	List<AppUser> findAll();
}
