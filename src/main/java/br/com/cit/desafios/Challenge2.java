package br.com.cit.desafios;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {
    public static List<Article> getAllJavaArticles(List<Article> articles) {
        List<Article> result = new ArrayList<>();
        for (Article article : articles) {
            if (article.getTags().contains("java")) {
                result.add(article);
            }
        }
        return result;
    }

    public static List<Article> getAllJavaArticles2(List<Article> articles) {
        return null;
    }
}
