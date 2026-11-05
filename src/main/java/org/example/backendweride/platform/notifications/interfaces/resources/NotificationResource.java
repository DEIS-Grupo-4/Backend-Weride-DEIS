package org.example.backendweride.platform.notifications.interfaces.resources;

import java.util.Date;

public record NotificationResource(
        String id,
        Long userId,
        String title,
        String message,
        String type,
        String category,
        String priority,
        java.time.LocalDateTime createdAt,
        Date readAt,
        boolean isRead,
        boolean actionRequired,
        String relatedEntityId,
        String relatedEntityType,
        String icon,
        String color
) {}