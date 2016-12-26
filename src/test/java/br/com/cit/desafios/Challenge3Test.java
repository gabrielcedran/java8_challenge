package br.com.cit.desafios;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Challenge3Test {
    @Test
    public void test() {
        List<Article> data = DataFactory.obtainData();
        Map<String, List<Article>> articles = Challenge3.groupByAuthor(data);
        Assert.assertEquals(7, articles.size());
    }

    @Test
    public void test2() {
        List<Article> data = DataFactory.obtainData();
        Map<String, List<Article>> articles = Challenge3.groupByAuthor2(data);
        Assert.assertEquals(7, articles.size());
    }

}
