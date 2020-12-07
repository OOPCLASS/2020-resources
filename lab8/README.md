### Skeleton for phone book app

Implement CRUD (Create/Read/Update/Delete) operations for a phone book app. The phone book should
display a list of persons with a name and phone number. For each entry in the list you should be able
to edit or remove it. There should be a way to add new persons to the phone book. All the data
should be stored in a MySql database.

### Setup
1. Make sure you have a local MySQL server running (e.g. host: `localhost`, port: `3306`)
2. Create a new database (e.g. `agenda`)
3. Grant credentials on the database (e.g. user: `root`, pass: `test`)
4. Import the project in your IDE (e.g. IntelliJ: `File>New>Project From Existing Sources..`, Eclipse: http://letmegooglethat.com/?q=eclipse+import+maven+project)
5. GoTo `Application.java` and run the app by calling the `main` method

If all goes well you should see a message like `ro.utcluj.agenda.Application: Started Application in 3.287 seconds (JVM running for 3.655)`

### Guidelines
`view` package should contain all the visual components. Do not create them anywhere else.

`model` package contains the classes that will map to db tables

`repository` package contains the interfaces with which you could perform CRUD operations on the db

`service` package contains the classes which manipulate the data to be stored and read from db

`validator` package contains classes which are meant to provide methods that validate the data before being saved to db

`controller` package contains classes which make the CRUD operations available to the `view` classes

The main flow of a `save action` should be:

Read data from `view`, validate it using `validator`, pass it to save method in `controller`, pass it further to `service` for additional processing
and lastly pass it to `repository` for saving to db.

### Rules
`view` classes use `controller` classes

`controller` classes use `service` and `validator` classes

`service` classes use `repository` or other `service` classes

`model` classes could be used by any other classes from any other packages

### FAQ

You could ask any questions, and I'll add them here.
