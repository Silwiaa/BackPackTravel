package com.backpacktravel.domain.hotelResponseDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityDto {

    @JsonProperty("centroid")
    private CentroIdDto centroid;

    @JsonProperty("official_center")
    private String official_center;

    @JsonProperty("name")
    private String name;

    @JsonProperty("entity_type")
    private String entity_type;

    @JsonProperty("entity_id")
    private int entity_id;

    @JsonProperty("levelOfEntityType")
    private int levelOfEntityType;
}
