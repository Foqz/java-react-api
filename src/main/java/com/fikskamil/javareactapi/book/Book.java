package com.fikskamil.javareactapi.book;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String title;

    @JsonProperty
    private String author;

    @JsonProperty
    private String isbn;
}
