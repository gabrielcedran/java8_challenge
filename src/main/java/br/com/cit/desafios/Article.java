package br.com.cit.desafios;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Article {

    private final String title;
    private final String author;
    private final List<String> tags;

}
