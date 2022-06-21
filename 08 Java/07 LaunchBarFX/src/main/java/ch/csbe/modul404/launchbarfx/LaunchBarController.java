package ch.csbe.modul404.launchbarfx;

import javafx.event.ActionEvent;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class LaunchBarController {
    private String os;

    public LaunchBarController() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win"))
            this.os = "win";
        if (os.contains("mac"))
            this.os = "mac";
        if (os.contains("nix") || os.contains("nux"))
            throw new RuntimeException("Linux is not supported, sorry :(.");
    }

    private void startApplicationOnMac(String[] command) {

        ProcessBuilder processBuilder = new ProcessBuilder(command);
        processBuilder.directory(new File(System.getProperty("user.home")));

        try {
            processBuilder.start();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private void startApplicationOnWindows(String command) {
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        try {
            processBuilder.start();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private void openWebSiteOnMac(String[] command) {
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec(command);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private void openWebSiteOnWindows(String url) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI(url));
    }

    public void onIntelliJButtonClick(ActionEvent event) {
        if (os.equals("mac")) {
            String[] command = {"open", "/Applications/IntelliJ IDEA.app"};
            startApplicationOnMac(command);
        } else {
            String command = "\"C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2022.1\\bin\\idea64.exe\"";
            startApplicationOnWindows(command);
        }
    }

    public void onSceneBuilderClick(ActionEvent event) {
        if (os.equals("mac")) {
            String[] command = {"open", "/Applications/SceneBuilder.app"};
            startApplicationOnMac(command);
        } else {
            String command = "\"C:\\Users\\michael\\AppData\\Local\\SceneBuilder\\SceneBuilder.exe\"";
            startApplicationOnWindows(command);
        }
    }

    public void onGoogleClick(ActionEvent event) {
        String url = "https://google.com";
        if (os.equals("mac")) {
            String[] command = {"open", url};
            openWebSiteOnMac(command);
        } else {
            try {
                openWebSiteOnWindows(url);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void onStackOverflowClick(ActionEvent event) {
        String url = "https://stackoverflow.com";
        if (os.equals("mac")) {
            String[] command = {"open", url};
            openWebSiteOnMac(command);
        } else {
            try {
                openWebSiteOnWindows(url);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void onCloseClick(ActionEvent event) {
        System.exit(0);
    }
}