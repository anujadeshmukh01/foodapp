package com.first.FoodApp.order.services;

import com.first.FoodApp.enums.OrderStatus;
import com.first.FoodApp.order.dtos.OrderDTO;
import com.first.FoodApp.order.dtos.OrderItemDTO;
import com.first.FoodApp.response.Response;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderService {


    Response<?> placeOrderFromCart();
    Response<OrderDTO> getOrderById(Long id);
    Response<Page<OrderDTO>> getAllOrders(OrderStatus orderStatus, int page, int size);
    Response<List<OrderDTO>> getOrdersOfUser();
    Response<OrderItemDTO> getOrderItemById(Long orderItemId);
    Response<OrderDTO> updateOrderStatus(OrderDTO orderDTO);
    Response<Long> countUniqueCustomers();


}
