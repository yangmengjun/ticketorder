package com.yang.dao;

import com.yang.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: yangmengjun
 * @date: 2019\3\26 0026 17:18
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}