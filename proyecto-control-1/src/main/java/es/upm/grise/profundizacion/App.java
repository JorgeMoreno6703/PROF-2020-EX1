package es.upm.grise.profundizacion;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.apache.commons.io.IOUtils;

import java.nio.charset.StandardCharsets;

public class App {

    public static void main(String[] args) throws Exception {

        GitHub github = GitHub.connectAnonymously();
        GHRepository repo = github.getRepository("GRISE-UPM/PROF-2020-EX1");

        System.out.println(
            IOUtils.toString(repo.getReadme().read(), StandardCharsets.UTF_8)
        );
    }
}

