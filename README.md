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

execute it by using command: 

```
java -jar target/demo-0.0.1-SNAPSHOT.jar

```

Running app will be available accessing url:

```
localhost:8888/data
```


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Fred Martmaa**

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

