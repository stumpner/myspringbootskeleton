# My Skeleton for building Springboot Applications

This repository should be a skeleton for web applications with spring framework with mongodb as the database and bootstrap as the front-end framework.

Feel free to use this skeleton for building your own web application.

# Getting startet

* Open the build.gradle as new project in your favorite IDE
* Start a mongodb docker container:
    `docker run -it -p 27017:27017 --name mongodb -d mongo`
* run the gradle task bootRun to start the skeleton sample application on your host
    `gradlew bootRun`
* point your favorite browser to localhost:8080/
* start developing your database webapplication

# License

This project is licensed under the Apache 2 License - see the LICENSE file for details

Copyright 2018 by Franz STUMPNER (franz@stumpner.com)
