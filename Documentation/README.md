#AutoRest Documentation

This is the official documentation for AutoRest.

## Contents
1. Getting AutoRest
2. Defining Clients
    - Generating Swagger from Web API
    - [Working with Swagger](swagger.md) - overview of rules used by AutoRest while parsing [Swagger 2.0](https://github.com/swagger-api/swagger-spec/blob/master/versions/2.0.md) specifications
3. Generating Clients
    - [Command Line Interface](cli.md) - documentation for AutoRest.exe command line interface
    - Visual Studio Integration
    - Troubleshooting
4. Using Generated Clients (C#) - overview of generated code and various extensibility points
    - [Project Setup](clients-proj-setup.md)
    - [Initialization](clients-init.md)
    - [Operations](clients-ops.md)
    - [Authentication](clients-auth.md)
    - [Error Handling](clients-error.md)
    - [Custom Http Pipeline](clients-handlers.md)
    - [Tracing](clients-tracing.md)
    - [Automatic Retries](clients-retry.md)
5. AutoRest Architecture
    - Overview
    - Code Generators
    - Modelers
6. Building
    - [Code & Unit testing](building-code.md)
7. Contributing to the code