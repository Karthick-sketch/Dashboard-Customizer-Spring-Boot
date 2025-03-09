package com.example.dashboardcustomizer.entity;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.dashboardcustomizer.constants.ChartType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "widgets")
public class Widget {
    @Id
    private String id;
    private String title;
    private ChartType chartType;
    private List<String> labels;
    private List<Map<String, Object>> datasets;

    public Widget() {
        this.id = UUID.randomUUID().toString();
    }
}
