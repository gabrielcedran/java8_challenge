package br.com.cit.desafios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge3 {
    public static Map<String, List<Article>> groupByAuthor(List<Article> articles) {
        Map<String, List<Article>> result = new HashMap<>();

        for (Article article : articles) {
            if (result.containsKey(article.getAuthor())) {
                result.get(article.getAuthor()).add(article);
            } else {
                ArrayList<Article> articlesNew = new ArrayList<>();
                articlesNew.add(article);
                result.put(article.getAuthor(), articlesNew);
            }
        }

        return result;
    }

    public static Map<String, List<Article>> groupByAuthor2(List<Article> articles) {
        return null;
    }
}
