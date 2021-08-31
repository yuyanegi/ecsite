package jp.co.internous.ecsite.model.dao;

import java.util.List;

import jp.co.internous.ecsite.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findByUserNameAndPassword(String userName,String password);
}
