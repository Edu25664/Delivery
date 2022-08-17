package com.Edu25664.vendas.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import com.Edu25664.vendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
