package com.example.server.repository;

import com.example.server.model.OrderStatus;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends PagingAndSortingRepository<OrderStatus, Long> {
}