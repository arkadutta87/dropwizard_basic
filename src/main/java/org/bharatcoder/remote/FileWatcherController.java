package org.bharatcoder.remote;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bharatcoder.resource.FileWatcher;
import org.bharatcoder.views.FileWatcherView;

@Path("/watchFile")
@Produces(MediaType.APPLICATION_JSON)
public class FileWatcherController {

  private static String fileName = "reco-logs.log";

  @GET
  @Path("/view_freemarker")
  @Produces(MediaType.TEXT_HTML)
  public FileWatcherView getFileWatcherViewFreemarker() {
    long id = System.currentTimeMillis();
    return new FileWatcherView(FileWatcherView.Template.FREEMARKER, new FileWatcher(id, fileName));
  }
}
