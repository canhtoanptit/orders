package vn.com.quyenbeo.service;

import vn.com.quyenbeo.config.Constants;
import vn.com.quyenbeo.domain.Order;
import vn.com.quyenbeo.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;


/**
 * Service Implementation for managing Order.
 */
@Service
public class OrderService {

    private final Logger log = LoggerFactory.getLogger(OrderService.class);

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Save a order.
     *
     * @param order the entity to save
     * @return the persisted entity
     */
    public Order save(Order order) {
        log.debug("Request to save Order : {}", order);
        order.setStatus(Constants.NEW_ORDER);
        return orderRepository.save(order);
    }

    /**
     *  Get all the orders.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    public Page<Order> findAll(Pageable pageable) {
        log.debug("Request to get all Orders");
        return orderRepository.findAllByOrderByStatusAscLastModifiedDateDesc(pageable);
    }

    /**
     *  Get one order by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    public Order findOne(String id) {
        log.debug("Request to get Order : {}", id);
        return orderRepository.findOne(id);
    }

    /**
     *  Delete the  order by id.
     *
     *  @param id the id of the entity
     */
    public void delete(String id) {
        log.debug("Request to delete Order : {}", id);
        orderRepository.delete(id);
    }
}
