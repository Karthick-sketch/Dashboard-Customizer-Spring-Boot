package com.example.dashboardcustomizer.service;

import com.example.dashboardcustomizer.entity.Widget;
import com.example.dashboardcustomizer.repository.WidgetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Widget updateWidget(String id, Widget updateWidget) {
        Optional<Widget> widget = widgetRepository.findById(id);
        if (widget.isEmpty()) {
            throw new RuntimeException("No widget with ID of '" + id + "'");
        }
        return widgetRepository.save(widget.get().assign(updateWidget));
    }
}
