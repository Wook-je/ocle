package com.yeol.ocle.repository.usermgmt;

import com.yeol.ocle.model.userinfo.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있음.
//@Repository라는 어노테이션이 없어도 IoC 됨. JpaRepository를 상속했기 때문
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * JPA query method
     *
     * select * from user where username = 1?;
     * @param username
     * @return User user
     */
    public User findByUsername(String username);
}
