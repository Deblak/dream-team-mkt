# dream-team-mkt

Welcome to Dream team mkt.

Please follow this readme to initialize the project on your computer.

first clone the repository:
```txt
git clone https://github.com/Deblak/dream-team-mkt.git
```

## Front end.

Run the following:
```txt
cd dream-team-mkt-presentation
npm install
```
lanch your local server with
```txt
npm run dev
```

## Database.

Create your posgreql database, open your favorite DB IDE connect to any postgresql database and run:
```sql
CREATE DATABASE dream_team_mkt;
```

When you database is created run this two script:
```txt
your_path/dream-team-mkt/dream-team-mkt-data/Scripts/schema.ddl.sql
your_path/dream-team-mkt/dream-team-mkt-data/Scripts/Script.dml.sql
```

## Api.

Open your favorite JAVA IDE and open the project in:
```txt
your_path/dream-team-mkt/dream-team-mkt-business
```
Create a folder:
```txt
resources
```
in:
```txt
your_path/dream-team-mkt/dream-team-mkt-business/src/main
```

then you have to create a file:
```txt
application.properties
```

in your application.properties fill in the file with:
```txt
spring.datasource.url=jdbc:postgresql://localhost:YOUR DB PORT/YOUR DB NAME
spring.datasource.username=YOUR USER NAME
spring.datasource.password=YOUR PASSWORD
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

co.simplon.dream-team.email.from=SECRET-EMAIL

# SMTP/Mail properties:
spring.mail.protocol=smtp
spring.mail.host=SECRET-HOST
spring.mail.port=SECRET-PORT
spring.mail.username=SECRET-EMAIL
spring.mail.password=SECRET-PASSWORD
spring.mail.properties.mail.smtp.ssl.enable=true

co.simplon.dream-team.cors=http://localhost:5173
#spring.config.activate.on-profile=local

logging.level.root=WARN
logging.file.name=./logs/dream-team-mkt.log
logging.logback.rollingpolicy.file-name-pattern=./logs/dream-team-mkt.%d{yyyy-MM-dd}.%i.log
logging.logback.rollingpolicy.max-file-size=10MB
logging.logback.rollingpolicy.total-size-cap=200MB
logging.logback.rollingpolicy.max-history=7
logging.pattern.console=
```
please contact us to get SECRETS !
