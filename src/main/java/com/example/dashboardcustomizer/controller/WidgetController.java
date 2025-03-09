package com.example.dashboardcustomizer.controller;

import com.example.dashboardcustomizer.entity.Widget;
import com.example.dashboardcustomizer.service.WidgetService;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/widget")
@AllArgsConstructor
public class WidgetController {
    private WidgetService widgetService;

    @GetMapping("/all")
    public ResponseEntity<List<Widget>> getAllWidgets() {
        return ResponseEntity.ok(widgetService.getAllWidgets());
    }

    @PostMapping
    public ResponseEntity<Widget> createWidget(@RequestBody Widget widget) {
        return ResponseEntity.status(HttpStatus.CREATED).body(widgetService.createWidget(widget));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Widget> updateWidget(@PathVariable String id, @RequestBody Widget widget) {
        return ResponseEntity.ok(widgetService.updateWidget(id, widget));
    }
}
