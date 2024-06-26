# springboot-hosting-catalyst
To install Catalyst, you can use the following command:
```
npm install -g zcatalyst-cli
```
Before installing Catalyst, make sure you have Node.js installed on your system. If you don't have Node.js installed, you can download it from the official Node.js website: [https://nodejs.org](https://nodejs.org)

Once Node.js is installed, you can proceed with the installation of Catalyst using the command mentioned above.

To create a package for your Spring API project, you can use the following command inside the `SpringAPI` folder:

```bash
./mvnw clean package
```

Make sure you navigate to the `SpringAPI` folder using the necessary `cd` commands before running the above command.

This command will clean the project, compile the source code, run tests, and package the application into a JAR file.

# springboot-hosting-catalyst
To install Catalyst, you can use the following command:
```bash
npm install -g zcatalyst-cli
```

Before installing Catalyst, make sure you have Node.js installed on your system. If you don't have Node.js installed, you can download it from the official Node.js website: [https://nodejs.org](https://nodejs.org)

Once Node.js is installed, you can proceed with the installation of Catalyst using the command mentioned above.

To create a package for your Spring API project, you can use the following command inside the `SpringAPI` folder:

```bash
./mvnw clean package
```

Make sure you navigate to the `SpringAPI` folder using the necessary `cd` commands before running the above command.

This command will clean the project, compile the source code, run tests, and package the application into a JAR file.

Once the package is created, you can run the Spring API using the appropriate command for your setup.

To deploy your application, navigate to the `deployment` folder and use the following commands:
```bash
catalyst login
```
The `catalyst login` command is used to authenticate and log in to the Catalyst platform. It allows you to access and manage your Catalyst account.

```bash
catalyst init
```
The `catalyst init` command is used to initialize a new Catalyst project. It sets up the necessary files and configurations for your project.

```bash
catalyst serve
```
The `catalyst serve` command is used to run your Catalyst project locally. It starts a local server and allows you to test and preview your application.

```bash
catalyst deploy
```
The `catalyst deploy` command is used to deploy your Catalyst project to a hosting environment. It packages and uploads your application to the Catalyst platform, making it accessible to the public.

Please note that these commands assume you have the Catalyst CLI (Command Line Interface) installed and configured on your system.

Make sure you have the necessary credentials and configurations set up before running these commands.

