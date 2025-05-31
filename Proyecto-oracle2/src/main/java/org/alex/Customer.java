package org.alex;

public record Customer(
        Long customerId,
        String emailAddress,
        String fullName) {
}
