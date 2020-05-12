<#-- @ftlvariable name="" type="com.example.views.FileWatcherView" -->
<html>
    <head>
      <!--<link rel="stylesheet" href="/assets/pure-min.css">-->
    </head>
    <body>
        <!-- calls getPerson().getFullName() and sanitizes it -->
        <h2><b><i>File Watcher Application Started ---- </i></b></h2>
        <h4>Lister with id: ${fileWatcher.id} is watching file: ${fileWatcher.fileName}</h4>
        <div id=${fileWatcher.id}></div>
    </body>
</html>