#  An EcoBike Rental System
<p align="center">
  <img src="assets/images/logo.png" />
</p>

## Getting Started

Welcome to the AIMS project. Here is a guideline to help you get started.

## Folder Structure

The workspace contains the following folders, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
- `assets`: the folder to maintain static resources
- `test`: the folder for testing purpose

## Dependency Management
### Working with Eclipse
Import the root directory of this repository after cloning under `Eclipse` -> `Open Projects from File System...` or by using EGit.

### MYSQL
Import `mysql-connector-j-8.1.0.jar` in `lib` under `Eclipse` -> `Project` -> `Properties` -> `Java Build Path` -> `Classpath` -> `Add JARs...`.

In case you have not installed Mysql Server on your local machine, follow this tutorial: https://www.youtube.com/watch?v=k5tICunelSU&t=15s

Connect Java with MySQL DB: https://www.youtube.com/watch?v=bmv5SLrEQ-M&t=146s&fbclid=IwAR3A-rlxH2wIeXO2ZFepj-AD2jFtMWp6H1o6xHqPmI36B_j8H5oVtiiRVo4&ab_channel=AbhishekChaudhary

Paste SQL query (`DB/create.sql`) in your MySQL server

Then config `DB_PASSWORD` with your MySQL password in `utils/Configs.java`

### JUnit
Import `JUnit5` library under `Eclipse` -> `Project` -> `Properties` -> `Java Build Path` -> `Modulepath` -> `Add Library...` -> `JUnit` -> `Next`.

### JavaFX
**Note:** At first, please try to run the project once, and then follow these steps.
1. Create a new `User Library` under `Eclipse` -> `Window` -> `Preferences` -> `Java` -> `Build Path` -> `User Libraries` -> `New`
2. Name it anything you want, e.g., `JavaFX15`, and include the ***jars*** under either the `lib/linux/javafx-sdk-15` directory for Linux distro or the `lib/win/javafx-sdk-15` directory for Windows in the project.
3. Include the library, e.g., `JavaFX15`, into the classpath.

### Add VM arguments
Click on `Run` -> `Run Configurations...`  -> `Java Application`, create a new launch configuration for your project and add these VM arguments:
- For Linux distro: 
> `--module-path lib/linux/javafx-sdk-15/lib --add-modules javafx.controls,javafx.fxml`
- For Windows:
> `--module-path lib/win/javafx-sdk-15/lib --add-modules javafx.controls,javafx.fxml`

## Authors
- linhnt   - ICT - k65
- linh.pk  - ICT - k65
- linh.vt  - ICT - k65
- long.bt  - ICT - k65