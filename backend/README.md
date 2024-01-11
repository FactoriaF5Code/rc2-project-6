# Trooking API

## Setup and run

This project uses Java 17 or higher.

Use the maven wrapper to run the server:

```
./mvnw spring-boot:run
```

On windows, run: 

```
mvnw.cmd spring-boot:run
```

## Running the tests

In order to run the included tests, do: 

```
./mvnw test
```


### Troubleshooting

- When using Visual Studio Code, you may want to update your settings with the following static imports for Java:

```
//...
"java.completion.favoriteStaticMembers": [
        "org.junit.Assert.*",
        "org.junit.Assume.*",
        "org.junit.jupiter.api.Assertions.*",
        "org.junit.jupiter.api.Assumptions.*",
        "org.junit.jupiter.api.DynamicContainer.*",
        "org.junit.jupiter.api.DynamicTest.*",
        "org.hamcrest.MatcherAssert.*",
        "org.mockito.Mockito.*",
        "org.mockito.ArgumentMatchers.*",
        "org.mockito.Answers.*",
        // SpringBoot Stuff
        "org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*",
        "org.springframework.test.web.servlet.result.MockMvcResultMatchers.*"
    ]
//...
```