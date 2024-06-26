package de.maibornwolff.alabenkhlifa.monolith.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class Pricing(
    @Id
    val pricingId: Long = 0,
    val productId: Long = 0,
    val basePrice: Double = 0.0,
    val discount: Double = 0.0
)
