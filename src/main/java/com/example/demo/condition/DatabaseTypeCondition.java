package com.example.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class DatabaseTypeCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(DatabaseType.class.getName());
        String type = (String) attributes.get("value");
        String enabledDBType = System.getProperty("dbType","MYSQL");
        System.out.println("choose dbType --------> " + enabledDBType);
        return (enabledDBType != null && type != null && enabledDBType.equalsIgnoreCase(type));
    }
}
