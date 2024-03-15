package de.maibornwolff.alabenkhlifa.monolith.product

import de.maibornwolff.alabenkhlifa.monolith.product.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Long>