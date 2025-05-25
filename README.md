# Riven Bot for Discord (Legacy)
> This repository contains the monolithic, legacy implementation of RivenBot.
> Active development has moved to a new, modular version of the bot. This codebase is no longer maintained, and is preserved for historical reference and migration purposes only.

![Project Status](https://img.shields.io/badge/status-archived-lightgrey) 

This project served as the original implementation of RivenBot and was a learning ground for building real-time, API-integrated Discord utilities. It helped prototype features and shaped the foundation for the [modular version](https://github.com/Riven-of-a-Thousand-Servers/) that is currently in development.

## Why?

This project was built out of a desire to learn by building something fun and personally meaningful. The bot provided a practical way to explore system design, caching, observability, reactive programming, and infrastructure automation.

## Reflections on Technology Choices

The technology stack chosen for this project was intentionally ambitious and modern, including reactive programming with Spring Webflux. While Webflux and the reactive paradigm offer impressive scalability and non-blocking I/O, **they introduce substantial complexity when it comes to reasoning about code, debugging, and maintaining the system over time**.

> ✅ **Lesson learned:** Choosing a "shiny" or advanced technology can be valuable for learning—but may not be the most pragmatic choice for long-term maintainability, especially in solo or small-team projects.

These reflections have directly influenced the architectural decisions in the next-generation RivenBot, which focuses on modularity, observability, and maintainability over technical novelty.

## Stack
  - [Spring Boot](https://spring.io/projects/spring-boot) - Official documentation for Spring Boot
  - [Spring Webflux](https://spring.io/reactive) - Official documentation for Spring Reactive framework, for Project Reactor see [here](https://projectreactor.io/)
  - [Redis](https://redis.io/) - Official documentation for Redis
  - [Docker](https://www.docker.com/) - Official documentation for Docker & Docker Compose
  - [MongoDB](https://mongodb.com) - Official documentation for MongoDB
## Testing
  - [JUnit5](https://junit.org/junit5/) - Official documentation for JUnit5 for testing JVM based languages
  - [Mockito](https://site.mockito.org/) - Official documentation for Mockito
  - [AssertJ](https://assertj.github.io/doc/) - Official documentation for AssertJ assertions framework for testing
  - [Test Containers](https://java.testcontainers.org/) - Official documentation for Test Containers using Java
  - [Wiremock](https://wiremock.org/docs/) - Official documentation for Wiremock
## Observability
  - [Loki](https://grafana.com/oss/loki/) - Official documentation for OSS Loki
  - [Grafana](https://grafana.com/oss/grafana) - Official documentation for OSS Grafana
  - [Loki4j](https://github.com/loki4j/loki-logback-appender) - Official GitHub repository for Loki4j Logback Appender

> Dependency versions can be found in the `build.gradle` file.

## Current Status

🚧 **RivenBot is undergoing a major rewrite.**  
This codebase is no longer in active development, and the bot is temporarily offline as we migrate to a more modular infrastructure.

## Features (Legacy)

### Raid Stats

This version of the bot includes a `/raid_stats` command that fetches and aggregates player raid data. The feature was built to handle large volumes of reports per user, though performance tuning and filtering were still a work in progress.

https://github.com/user-attachments/assets/d296c71e-2061-47ba-af2a-b2c3bd4b2f9e
