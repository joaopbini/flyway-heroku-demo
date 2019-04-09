# Flyway Heroku Demo

The Spring Boot model of deploying standalone applications is a great fit for Heroku. You can use either Maven or Gradle to deploy a Spring application on Heroku, but for this guide we’ll assume that you’re using Maven and have Maven 3 installed on your machine.

To begin, create a free Heroku account. Then download and install the Heroku CLI.

[DOWNLOAD HEROKU CLI](https://devcenter.heroku.com/articles/heroku-cli)

Once installed, you can use the heroku command from the terminal to log in using the email address and password you used when creating your Heroku account:

>heroku login


## Preparing a Spring Boot app for Heroku


>git clone https://github.com/joaopbini/flyway-heroku-demo.git

>cd flyway-heroku-demo

> heroku create

This also creates a remote repository called heroku in your local git repo. Heroku generates a random name for your app. 
You can rename it later with the heroku `apps:rename` command.

Now deploy your code:

> git push heroku master

The application is now deployed. You can visit the app’s URL by running this command:

> heroku open

Access your application url heroku /swagger-ui.html (in my case: https://flyway-heroku-demo.herokuapp.com/swagger-ui.html) 
to see the api documentation and execute the endpoint /person 
to see:

```
[
  {
    "firstName": "Dave",
    "lastName": "Syer"
  },
  {
    "firstName": "Joao",
    "lastName": "Bini"
  }
]
```

You can view the logs for the application by running this command:

> heroku logs --tail

## Extra: Some Variables

You can see the `DATABASE_URL` provided to an application by running:

> heroku config

The official Heroku buildpacks for Java, Kotlin, Scala, Clojure, and Gradle will attempt to create 
a `JDBC_DATABASE_URL` environment variable when a dyno starts up. This variable is dynamic and 
will not appear in your list of configuration variables when running heroku config. You can view it by 
running the following command:

> heroku run echo $JDBC_DATABASE_URL

The variable will include `?user=<user>&password=<password>` parameters, but 
`JDBC_DATABASE_USERNAME` and `JDBC_DATABASE_PASSWORD` environment variables will 
also be set when possible.