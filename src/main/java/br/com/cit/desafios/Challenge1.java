package br.com.cit.desafios;

import java.util.List;

public class Challenge1 {

    public static Article getFirstJavaArticle(List<Article> articles) {
        for (Article article : articles) {
            if (article.getTags().contains("java10")) {
                System.out.print("message");
                return article;
            }
        }
        return null;
    }

    public static Article getFirstJavaArticle2(List<Article> articles) {
        return articles.stream().filter(article -> article.getTags().contains("java10")).findFirst().orElse(Article.builder().build());
    }

    public static void print() {
        System.out.println("new beautiful method");
    }
}
