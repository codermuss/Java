package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserDao<T> extends JpaRepository<T, Integer> {

}
