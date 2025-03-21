package com.example.dashboardcustomizer.repository;

import com.example.dashboardcustomizer.entity.Widget;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WidgetRepository extends MongoRepository<Widget, String> {
}
