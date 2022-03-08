package io.overledger.springboottemplateservice.dto;

import io.overledger.springboottemplateservice.mongodb.TemplateDocument;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class TemplateRequest {
    String templateField;

    public TemplateDocument toTemplateDocument() {
        return TemplateDocument.builder()
                .id(UUID.randomUUID())
                .templateField(this.templateField)
                .build();
    }

    public TemplateResponse ToResponseDocument() {
        return TemplateResponse.builder()
                .templateField(this.templateField)
                .build();
    }
}




