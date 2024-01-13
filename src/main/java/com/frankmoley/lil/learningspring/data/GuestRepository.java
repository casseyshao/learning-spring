package com.frankmoley.lil.learningspring.data;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository or CrudRepository works.
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
