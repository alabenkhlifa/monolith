package de.maibornwolff.alabenkhlifa.monolith.service

import de.maibornwolff.alabenkhlifa.monolith.entity.Order
import de.maibornwolff.alabenkhlifa.monolith.entity.OrderStatus
import de.maibornwolff.alabenkhlifa.monolith.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(private val orderRepository: OrderRepository) {
    fun getOrders() = orderRepository.findAll()
    fun getPendingOrders() = orderRepository.findByStatus(OrderStatus.PENDING)
    fun getShippedOrders() = orderRepository.findByStatus(OrderStatus.SHIPPED)
    fun getDeliveredOrders() = orderRepository.findByStatus(OrderStatus.DELIVERED)
    fun getOrderById(orderId: Long) = orderRepository.findById(orderId)
    fun createOrUpdateOrder(order: Order) = orderRepository.save(order)
    fun deleteOrder(orderId: Long) = orderRepository.deleteById(orderId)
}