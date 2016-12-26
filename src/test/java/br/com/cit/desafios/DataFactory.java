package br.com.cit.desafios;

import java.util.Arrays;
import java.util.List;

public class DataFactory {

    public static List<Article> obtainData() {
        return Arrays.asList(Article.builder().title("Java for dummies").author("Pedro Silva").tags(Arrays.asList("java", "programação", "iniciantes")).build(),
                        Article.builder().title("Tudo sobre java: certificação").author("Paulo Campos").tags(Arrays.asList("certificação", "java", "avançado")).build(),
                        Article.builder().title("Dot net eficaz").author("Pedro Silva").tags(Arrays.asList("programação", "dotnet")).build(),
                        Article.builder().title("Como ser produtivo com Python").author("Marcelo Haddad").tags(Arrays.asList("python", "programação")).build(),
                        Article.builder().title("Dokku sem mistérios").author("Moises Monteiro").tags(Arrays.asList("docker", "dokku")).build(),
                        Article.builder().title("Tunando o mongodb").author("Michel Medeiros").tags(Arrays.asList("database", "nosql", "mongodb", "mongo")).build(),
                        Article.builder().title("Java: Como programar").author("Rafael Carneiro").tags(Arrays.asList("programação", "java", "baśico", "avançado")).build(),
                        Article.builder().title("Boa práticas de Cucumber").author("Rafael Chaves").tags(Arrays.asList("cucumber", "automated tests", "gherkin")).build());
    }

}
