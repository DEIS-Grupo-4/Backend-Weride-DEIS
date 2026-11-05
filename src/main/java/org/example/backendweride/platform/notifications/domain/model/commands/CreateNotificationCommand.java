package org.example.backendweride.platform.notifications.domain.model.commands;

public record CreateNotificationCommand(
        Long userId,
        String title,
        String message,
        String type,
        String category,
        String priority,
        String relatedEntityId,
        String relatedEntityType,
        String icon,
        String color
) {}