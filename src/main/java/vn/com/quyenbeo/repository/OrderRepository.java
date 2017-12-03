package vn.com.quyenbeo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.com.quyenbeo.domain.Order;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Order entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

    Page<Order> findAllByDelFlagOrderByStatusAscLastModifiedDateDesc(boolean delFlag, Pageable pageable);
}
