package org.bharatcoder.views;

import org.bharatcoder.resource.FileWatcher;

import io.dropwizard.views.View;

public class FileWatcherView extends View {

  private final FileWatcher fileWatcher;

  public enum Template {
    FREEMARKER("freemarker/filewatcher.ftl");

    private String templateName;

    Template(String templateName) {
      this.templateName = templateName;
    }

    public String getTemplateName() {
      return templateName;
    }
  }

  public FileWatcherView(FileWatcherView.Template template, FileWatcher fileWatcher) {
    super(template.getTemplateName());
    this.fileWatcher = fileWatcher;
  }

  public FileWatcher getFileWatcher() {
    return fileWatcher;
  }
}
