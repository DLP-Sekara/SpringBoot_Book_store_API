package com.onlineBookStore.online_book_store.repo;

import com.onlineBookStore.online_book_store.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<User,Integer> {
}
