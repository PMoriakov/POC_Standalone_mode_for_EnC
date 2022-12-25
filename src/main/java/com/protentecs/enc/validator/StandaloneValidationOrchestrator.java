package com.protentecs.enc.validator;

import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pavel Moriakov
 * @since 22/12/2022
 */

@Service
@AllArgsConstructor
@ConditionalOnProperty(value ="standalone.mode", havingValue = "true")
public class StandaloneValidationOrchestrator {

    private final SchemaValidator schemaValidator;

}
