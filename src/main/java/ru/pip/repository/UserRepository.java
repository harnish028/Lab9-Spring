package ru.pip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pip.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    /*
    @Query("select u from ru.pip.entity.User u where u.nickname = :nickname")
    User findByNickname(@Param("nickname") String nickname);*/
}
