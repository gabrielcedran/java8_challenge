package br.com.cit.desafios;

import java.util.List;

public class Challenge1 {

    public static Article getFirstJavaArticle(List<Article> articles) {
        for (Article article : articles) {
            if (article.getTags().contains("java3")) {
                return article;
            }
        }
        return null;
    }

    public static Article getFirstJavaArticle2(List<Article> articles) {
        return articles.stream().filter(article -> article.getTags().contains("java3")).findFirst().orElse(Article.builder().build());
    }
}
