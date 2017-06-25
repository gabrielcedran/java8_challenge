package br.com.cit.desafios;

import java.util.List;

public class Challenge1 {

    public static Article getFirstJavaArticle(List<Article> articles) {
        for (Article article : articles) {
            if (article.getTags().contains("java13")) {
                System.out.print("new message from branch 13");
                return article;
            }
            System.out.print("counting");
        }
        System.out.print("not found!");
        return null;
    }

    public static Article getFirstJavaArticle2(List<Article> articles) {
        return articles.stream().filter(article -> article.getTags().contains("java13")).findFirst().orElse(Article.builder().build());
    }

    public static void print() {
        System.out.println("new beautiful method - branch 13");
    }
}
