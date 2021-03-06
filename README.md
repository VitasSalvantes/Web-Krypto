# Web-Krypto

[![GitHub license](https://img.shields.io/github/license/VitasSalvantes/Web-Krypto)](https://github.com/VitasSalvantes/Web-Krypto/blob/master/LICENSE)
[![GitHub issues](https://img.shields.io/github/issues/VitasSalvantes/Web-Krypto)](https://github.com/VitasSalvantes/Web-Krypto/issues)
[![current version](https://img.shields.io/badge/current_version-2.0-green)](#)

This app was created to reinforce the material learned during [this](https://itproger.com/course/java-spring) course. I
learned the basics of developing Java applications using Spring Boot technology and developed my own project.

## Table of contents ##

- [How does it work](#How-does-it-work)
- [Screenshots](#Screenshots)
- [Technologies](#Technologies)
- [Development progress](#Development-progress)
- [Project statistics](#Project-statistics)
- [How to install](#How-to-install)
- [How to contribute](#How-to-contribute)

## How does it work ##

This web application is designed to encrypt and decrypt texts using simple ciphers. At the moment, work with 3 ciphers
has been implemented: with the Caesar cipher, the Code Word cipher, and the Atbash cipher.

The first thing the user sees is the **home page**. It displays a short description of the web application and links to
cipher pages.

Then the user can go to one of the **cipher pages**. The user can read a detailed description of the cipher, encrypt
or decrypt any text and then, on the **result page**, copy the result to the clipboard by clicking on the button.

If the user wants to learn more about the developers of this application, then he can go to the **about page** and get
the necessary information.

## Screenshots ##

*All screenshots are relevant for version 2.0*

Home page:

![home](screenshots/home.png)

Atbash cipher page:

![atbash](screenshots/atbash.png)

Caesar cipher page:

![caesar](screenshots/caesar.png)

Code word cipher page:

![code_word](screenshots/code_word.png)

Result page:

![result](screenshots/result.png)

About page:

![about](screenshots/about.png)

## Technologies ##

- The programming language Java ([AdoptOpenJDK version 11.0.10](https://adoptopenjdk.net/))
  and [Spring Boot](https://spring.io/projects/spring-boot#overview) were chosen for development.

- Development was carried out in [IntelliJ IDEA](https://www.jetbrains.com/idea/) Ultimate Edition (license for
  students).

- [Maven](https://maven.apache.org/) was used to build the project and inject dependencies.

- [Thymeleaf](https://www.thymeleaf.org/) was chosen as the template engine.

- [Figma](https://www.figma.com/) was used to prototype the user interface.

- The app was designed using [Bootstrap](https://getbootstrap.com/).

- [WakaTime](https://wakatime.com/) was used to track activity.

- [Microsoft To Do](https://todo.microsoft.com/tasks/) was used to schedule tasks.

## Development progress ##

Development of the project began on **June 18, 2021**.

Application development is complete, but you can make your changes (both in design and in java code).

*Since I am developing this project mainly alone, I see no reason to use [Trello](https://trello.com/).*

## Project statistics ##

[![wakatime](https://wakatime.com/badge/github/VitasSalvantes/Web-Krypto.svg)](https://wakatime.com/badge/github/VitasSalvantes/Web-Krypto)

See more
on [WakaTime](https://wakatime.com/@9a3d815f-a717-4cd2-b355-b359c1e94cfd/projects/jofumsinqw?start=2021-06-20&end=2021-07-03)
.

*Activity tracking started on **July 1, 2021**.*

## How to install ##

1. Download the [latest release version](https://github.com/VitasSalvantes/Web-Krypto/releases) (Web-Krypto archive with
   .jar extension)
2. Check if java is installed (enter the command <code>java -version</code> in the command line or terminal), if java is
   not installed then [install](https://www.google.de/search?q=how+to+install+java)
3. Go to the command line or terminal to the folder with the downloaded archive and run the archive on the command line
   or terminal using the command <code>java -jar Web-Krypto.jar</code>
4. Open your browser and follow the link http://localhost:8080/
5. In order to exit the program, you need to enter <code>ctrl+c</code> in the command line or terminal or remove the
   task in the task manager

## How to contribute ##

If you want to take part in the development of this project, please
read [this](https://github.com/VitasSalvantes/Web-Krypto/blob/master/CONTRIBUTING.md) file.
