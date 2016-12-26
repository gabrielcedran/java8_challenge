package br.com.cit.desafios;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Challenge2Test {
    @Test
    public void test() {
        List<Article> data = DataFactory.obtainData();
        List<Article> articles = Challenge2.getAllJavaArticles(data);
        Assert.assertEquals(3, articles.size());
        Assert.assertEquals("Java for dummies", articles.get(0).getTitle());
        Assert.assertEquals("Tudo sobre java: certificação", articles.get(1).getTitle());
        Assert.assertEquals("Java: Como programar", articles.get(2).getTitle());
    }

    @Test
    public void test2() {
        List<Article> data = DataFactory.obtainData();
        List<Article> articles = Challenge2.getAllJavaArticles2(data);
        Assert.assertEquals(3, articles.size());
        Assert.assertEquals("Java for dummies", articles.get(0).getTitle());
        Assert.assertEquals("Tudo sobre java: certificação", articles.get(1).getTitle());
        Assert.assertEquals("Java: Como programar", articles.get(2).getTitle());
    }
}
