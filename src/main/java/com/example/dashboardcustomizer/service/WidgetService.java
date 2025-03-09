package com.example.dashboardcustomizer.service;

import com.example.dashboardcustomizer.entity.Widget;
import com.example.dashboardcustomizer.repository.WidgetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WidgetService {
    private WidgetRepository widgetRepository;

    public List<Widget> getAllWidgets() {
        return widgetRepository.findAll();
    }

    public Widget createWidget(Widget widget) {
        return widgetRepository.save(widget);
    }
}
