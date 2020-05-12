# dropwizard_basic
File Watcher Application with long pull to demonstrate features of DropWizard

Build :

mvn clean install 

Run Project :

java -jar target/tailing-file-pull-1.0-SNAPSHOT.jar server ./config/local/app-config.yml

Endpoints : 

http://localhost:8080/greeting?name=Arka%20Dutta
http://localhost:8081/
http://localhost:8081/prometheusMetrics
