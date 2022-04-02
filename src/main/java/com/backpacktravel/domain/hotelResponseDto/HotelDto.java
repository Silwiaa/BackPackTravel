package com.backpacktravel.domain.hotelResponseDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelDto {

    @JsonProperty("hotelId")
    private String hotelId;

    @JsonProperty("heroImage")
    private String heroImage;

    @JsonProperty("name")
    private String name;

    @JsonProperty("stars")
    private int stars;

    @JsonProperty("distance")
    private String distance;

    @JsonProperty("coordinates")
    private double[] coordinates;

    @JsonProperty("price")
    private String price;

    @JsonProperty("cheapestOfferPartnerId")
    private String cheapestOfferPartnerId;

    @JsonProperty("rawPrice")
    private int rawPrice;

    @JsonProperty("rating")
    private RatingDto rating;

    @JsonProperty("reviewSummary")
    private ReviewSummaryDto reviewSummary;

    @JsonProperty("cheapestOffer")
    private String cheapestOffer;

    @JsonProperty("offerTypes")
    private String offerTypes;

    @JsonProperty("guestType")
    private String guestType;

    @JsonProperty("exclusiveDealLabel")
    private String exclusiveDealLabel;

    @JsonProperty("pricesFrom")
    private String pricesFrom;

    @JsonProperty("images")
    private String[] images;

    @JsonProperty("otherRates")
    private List<OtherRatesDto> otherRates;

    @JsonProperty("priceDescription")
    private String priceDescription;

    @JsonProperty("taxPolicy")
    private String taxPolicy;

    @JsonProperty("cheapestOfferPartnerName")
    private String cheapestOfferPartnerName;

    @JsonProperty("branding")
    private String branding;
}
