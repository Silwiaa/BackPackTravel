package com.backpacktravel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("price")
    private Map<String, String> price;

    @JsonProperty("legs")
    private List<Object> legs;

    @JsonProperty("tags")
    private List<Object> tags;
}
