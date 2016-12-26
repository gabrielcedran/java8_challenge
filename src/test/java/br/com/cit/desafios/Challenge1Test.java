package br.com.cit.desafios;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Challenge1Test {

    @Test
    public void test() {
        List<Article> data = DataFactory.obtainData();
        Article article = Challenge1.getFirstJavaArticle(data);
        Assert.assertEquals("Java for dummies", article.getTitle());
        Assert.assertEquals("Pedro Silva", article.getAuthor());
    }

    @Test
    public void test2() {
        List<Article> data = DataFactory.obtainData();
        Article article = Challenge1.getFirstJavaArticle2(data);
        Assert.assertEquals("Java for dummies", article.getTitle());
        Assert.assertEquals("Pedro Silva", article.getAuthor());
    }
}
