# CONCISE TASK

Required task for Concise.

### Installing

Install docker by going to URL: 

Install postgres:9.6 image using docker console by command

```
docker pull postgres:9.6
```

Start a postgres instance.

```
docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d -p 5432:5432 postgres:9.6
```

Create database in postgres image.

```
docker exec -it some-postgres bash
```

Enter postgres

```
psql -U postgres (after this password can be asked which is 'mysecretpassword').
```
Run command to create database 'data'.
```
CREATE database data;
```

## Running the program

Run application

```
git clone https://github.com/t123583/concise.git
cd /concise
mvnw package

```

packaged jar will be in target/demo-0.0.1-SNAPSHOT.jar

execute it by using command: 

```
java -jar demo-0.0.1-SNAPSHOT.jar

```

Access program using url: localhost:8888/data


## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Authors

* **Fred Martmaa**

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

