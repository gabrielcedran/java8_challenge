package br.com.cit.desafios;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Challenge4 {

    public static Set<String> getDistinctTags(List<Article> articles) {
        Set<String> result = new HashSet<>();
        for (Article article : articles) {
            result.addAll(article.getTags());
        }
        return result;
    }

    public static Set<String> getDistinctTags2(List<Article> articles) {
        return null;
    }
}
