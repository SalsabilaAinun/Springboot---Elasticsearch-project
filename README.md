# Project Title

Brief description of your Java Spring Boot project with Elasticsearch.

## Running Elasticsearch

1. Open a command prompt.
2. Navigate to the project directory.

    ```bash
    cd path/to/your/project
    ```

3. Run Elasticsearch using the following command:

    ```bash
    .\path\to\elasticsearch\bin\elasticsearch.bat
    ```

   Ensure that Elasticsearch is running on http://localhost:9200.

## Running the Project

1. Open a command prompt.
2. Navigate to the project directory.

    ```bash
    cd path/to/your/project
    ```

3. Run the Spring Boot application using:

    ```bash
    ./mvnw spring-boot:run
    ```

   or if you have Maven installed globally:

    ```bash
    mvn spring-boot:run
    ```

   The application will be accessible at http://localhost:8080.

## Additional Information

- Make sure to configure your Spring Boot application to connect to the Elasticsearch instance running on http://localhost:9200.
- Customize the application's Elasticsearch settings in your project's configuration files.
- Refer to the official documentation for further details on configuring Spring Boot and Elasticsearch integration.

