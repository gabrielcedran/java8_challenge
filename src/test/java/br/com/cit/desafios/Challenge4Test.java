package br.com.cit.desafios;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Challenge4Test {
    @Test
    public void test() {
        List<Article> data = DataFactory.obtainData();
        Set<String> tags = Challenge4.getDistinctTags(data);
        Assert.assertEquals(17, tags.size());
    }

    @Test
    public void test2() {
        List<Article> data = DataFactory.obtainData();
        Set<String> tags = Challenge4.getDistinctTags2(data);
        Assert.assertEquals(17, tags.size());
    }
}
