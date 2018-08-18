# Page Objects

Page Objects project aims to provide examples of how to use Page Objects pattern used on test automatization scenario.

### Installation

Page Objects project requires java and maven to run automated tests. It requires an Atlantico jira account to be properly exected too.
Install java and maven dependencies (Linux environment).
```sh
$ sudo apt-get install default-jre
$ sudo apt-get install maven
```

On TestJira.java file, you need to change the username and password that will be used on tests:
 > private String username = "username";
   private String password = "password";

### Building Project
To run this project you can just run:
```sh
$ mvn install
```
And then, all tests will be executed and will displays the expected result (or not :D)

License
OpenSource Code