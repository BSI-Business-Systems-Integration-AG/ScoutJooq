# ScoutJooq
Scout jOOQ - Eclipse Scout Template Application using jOOQ for Persistence

## Usage

The archetype is currently not deployed on any repository. To install it locally change into directory ```archetype``` and build it. 

```bash
mvn clean install

```

Once it is in your local catalog you can generate a project from it. Navigate to the directory where you want to create the new project and execute:

```bash
mvn archetype:generate \
-DarchetypeGroupId=org.eclipse.scout.archetypes \
-DarchetypeArtifactId=basic-application-template \
-Dinteractive=true \
-DarchetypeCatalog=local
```

The following properties are used in the archetype:

* artefactId
* groupId
* version
* package
* appName
* javaVersion

In interactive mode, maven will ask for the values, otherwise you need to set them using `-D`:

```bash
mvn archetype:generate \
-DarchetypeGroupId=org.eclipse.scout.archetypes \
-DarchetypeArtifactId=basic-application-template \
-DappName="My Test App" \
-DgroupId=com.example \
-DartifactId=com.example.testapp \
-Dpackage=com.example.testapp \
-Dversion=1.0.0-SNAPSHOT \
-DarchetypeCatalog=local
```

Import the generated project into eclipse, launch configurations should be available. 

## Requirements

This code currently only works with Java 8.

## Post Generation Tasks

* Update the field ```DEFAULT_HOST``` in class ```ServerProperties``` to match the address of your database host.
* Update ```config.properties``` files need to be updated with proper security keys. These can be generated with the appropriate scout utilities

## Immediately running after creation

There is a derby DB configured that will run in-memory. This is not intended for production, but so the application is immediately executable without any further set up.

## Changing from Derby / Postgres to other Database

There are several tasks to be performed:

1. Change the JOOQ Dialect and related items in the database project.
2. Import an appropriate driver in the database project pom.
3. Change config.properties files to use the correct jdbc string and driver name
4. Change the connection information in `GeneratorApplication`


### Running the required postgres db

docker run -it --name scoutJooqPg -e POSTGRES_PASSWORD=securePassw0rd -d postgres

## How to use it

### Adding a new table

1. Add the table in the `database` module as a `IGeneratorTable` or inherit one of it's implementors.
2. Run `GeneratorApplication` to generate the Jooq Classses
3. Implement the appropriate service in the `server` module 