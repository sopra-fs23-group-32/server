# REST requests Table

<table>
<thead>
  <tr>
    <th>HTTP-Method </th>
    <th>Mapping </th>
    <th>Parameter  </th>
    <th>Param. Type </th>
    <th>Status Code </th>
    <th>Response </th>
    <th>Description </th>
  </tr>
</thead>
<tbody>
  <tr>
    <td rowspan="2">POST </td>
    <td rowspan="2">/users</td>
    <td rowspan="2">
        username&lt;String&gt;
        password&lt;String&gt; 
    </td>
    <td rowspan="2">Body </td>
    <td>201 </td>
    <td>User </td>
    <td>add User</td>
  </tr>
  <tr>
    <td>409 </td>
    <td>Error&lt;String&gt; </td>
    <td>Username existed</td>
  </tr>
  <tr>
    <td rowspan="3">PUT </td>
    <td rowspan="3">/users/login</td>
    <td rowspan="3">
        username&lt;String&gt;
        password &lt;String&gt;
    </td>
    <td rowspan="3">Body </td>
    <td>200 </td>
    <td>User </td>
    <td>Login user</td>
  </tr>
  <tr>
    <td>401 </td>
    <td>Error&lt;String&gt; </td>
    <td>password incorrect</td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>can't find username</td>
  </tr>
  <tr>
    <td rowspan="2">PUT </td>
    <td rowspan="2">/users/logout</td>
    <td rowspan="2">
        username&lt;String&gt;<br>
        password&lt;String&gt; 
    </td>
    <td rowspan="2">Body </td>
    <td>200 </td>
    <td>User </td>
    <td>Log out user </td>
  </tr>
  <tr>
    <td>400 </td>
    <td>Error&lt;String&gt; </td>
    <td>user already logged out</td>
  </tr>
  <tr>
    <td rowspan="2">PUT </td>
    <td rowspan="2">/users/{userId}</td>
    <td rowspan="2">
        userId&lt;long&gt;<br>
        username&lt;String&gt;<br>
        password&lt;String&gt;<br>
        birthDay&lt;String&gt;
    </td>
    <td rowspan="2">Query &amp; Body </td>
    <td>200 </td>
    <td>User </td>
    <td>update user profile </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>userId not found</td>
  </tr>
  <tr>
    <td>GET </td>
    <td>/users </td>
    <td>- </td>
    <td>- </td>
    <td>200 </td>
    <td>List&lt;User&gt; </td>
    <td>Get all users</td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">/users/{userId}</td>
    <td rowspan="2">userId&lt;long&gt; </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>User </td>
    <td>Get a user </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>userId not found</td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">/users/ranking?category</td>
    <td rowspan="2">category&lt;String&gt;<br>(optional) </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>List of userId&lt;long&gt;<br>
        username&lt;String&gt;<br>
        createDay&lt;Date&gt;<br>
        score&lt;long&gt;<br>
        gameNum&lt;long&gt;<br>
    </td>
    <td>Get ranking of all users</td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>no user</td>
  </tr>
  <tr>
    <td rowspan="2">POST </td>
    <td rowspan="2">/games </td>
    <td rowspan="2">
        category&lt;String&gt;<br>
        totalRounds&lt;int&gt;<br>
        countdownTime&lt;int&gt;
    </td>
    <td rowspan="2">Body </td>
    <td>201 </td>
    <td>Game </td>
    <td>create a lobby</td>
  </tr>
  <tr>
    <td>406 </td>
    <td>Error&lt;String&gt; </td>
    <td>Lobby type could not be created </td>
  </tr>
  <tr>
    <td rowspan="2">POST </td>
    <td rowspan="2">
        /games/{gameId}/<br>
        players/{playerId}
    </td>
    <td rowspan="2">
        gameId&lt;long&gt;<br>
        playerId&lt;long&gt;
    </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>- </td>
    <td>Add a player to a lobby</td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId / playerId not found</td>
  </tr>
  <tr>
    <td rowspan="2">POST </td>
    <td rowspan="2">
        /games/{gameId}/players/<br>
        {playerId}/answer
    </td>
    <td rowspan="2">
        gameId&lt;long&gt;<br>
        playerId&lt;long&gt;<br>
        answer&lt;String&gt;<br>
        timeTaken&lt;int&gt;
    </td>
    <td rowspan="2">Query &amp; Body </td>
    <td>200 </td>
    <td>- </td>
    <td>Submit player’s answer and update score </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId / playerId not found</td>
  </tr>
  <tr>
    <td rowspan="3">PUT </td>
    <td rowspan="3">/games/{gameId}</td>
    <td rowspan="3">gameId&lt;long&gt; </td>
    <td rowspan="3">Query </td>
    <td>200 </td>
    <td>Question </td>
    <td>Return question for next round and go head </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found</td>
  </tr>
  <tr>
    <td>409 </td>
    <td>Error&lt;String&gt; </td>
    <td>Game has ended</td>
  </tr>
  <tr>
    <td>GET </td>
    <td>/games</td>
    <td>- </td>
    <td>- </td>
    <td>200 </td>
    <td>List&lt;Game&gt; </td>
    <td>Get all games in SET UP state </td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">/games/{gameId}</td>
    <td rowspan="2">gameId&lt;long&gt; </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>Game </td>
    <td>Get details of this lobby </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found</td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">/games/{gameId}/status</td>
    <td rowspan="2">gameId&lt;long&gt; </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>GameStatus </td>
    <td>Get status of this lobby </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found</td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">/games/{gameId}/players</td>
    <td rowspan="2">gameId&lt;long&gt; </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td> List&lt;User&gt; </td>
    <td>Get player's list of this lobby </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found</td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">/games/{gameId}/ranking</td>
    <td rowspan="2">gameId&lt;long&gt; </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>List of 
        userId&lt;long&gt;<br>
        score&lt;int&gt;<br>
        rank&lt;int&gt;
    </td>
    <td>Get player's ranking for current round in lobby </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found / <br>no ranking found </td>
  </tr>
  <tr>
    <td rowspan="3">GET </td>
    <td rowspan="3">/games/{gameId}/results</td>
    <td rowspan="3">gameId&lt;long&gt; </td>
    <td rowspan="3">Query </td>
    <td>201 </td>
    <td>List&lt;String&gt;</td>
    <td>Get the winnerList of a game</td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found </td>
  </tr>
  <tr>
    <td>409 </td>
    <td>Error&lt;String&gt; </td>
    <td>game not ended</td>
  </tr>
  <tr>
    <td rowspan="3">DELETE </td>
    <td rowspan="3">/games/{gameId}</td>
    <td rowspan="3">gameId&lt;long&gt; </td>
    <td rowspan="3">Query </td>
    <td>200 </td>
    <td>- </td>
    <td>leave and delete game </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found </td>
  </tr>
  <tr>
    <td>409 </td>
    <td>Error&lt;String&gt; </td>
    <td>game not ended</td>
  </tr>
  <tr>
    <td rowspan="2">DELETE </td>
    <td rowspan="2">
        /games/{gameId}/<br>
        players/{playerId}
    </td>
    <td rowspan="2">
        gameId&lt;long&gt;<br>
        playerId&lt;long&gt;
    </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>- </td>
    <td>Player left the lobby </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found / <br>playerId not found </td>
  </tr>
  <tr>
    <td rowspan="3"> POST </td>
    <td rowspan="3">/gameInfo/{gameId}</td>
    <td rowspan="3">gameId&lt;long&gt;</td>
    <td rowspan="3">Query </td>
    <td>200 </td>
    <td>GameInfo </td>
    <td>Create a shared GameInfo </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found</td>
  </tr>
  <tr>
    <td>409 </td>
    <td>Error&lt;String&gt; </td>
    <td>game not ended</td>
  </tr>
  <tr>
    <td rowspan="3"> POST </td>
    <td rowspan="3">
        /users/{userId}/<br>
        gameHistories/{gameId}
    </td>
    <td rowspan="3">
        userId&lt;long&gt;<br>
        gameId&lt;long&gt;
    </td>
    <td rowspan="3">Query </td>
    <td>200 </td>
    <td>- </td>
    <td>Create user's GameHistory </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found / <br>userId not found </td>
  </tr>
  <tr>
    <td>409 </td>
    <td>Error&lt;String&gt; </td>
    <td>game not ended</td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">/users/{userId}/gameInfo</td>
    <td rowspan="2">userId&lt;long&gt; </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>List&lt;GameInfo&gt; </td>
    <td>- </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>userId not found </td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">
        /users/{userId}/<br>
        gameHistories
    </td>
    <td rowspan="2">userId&lt;long&gt; </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>List&lt;GameHistory&gt; </td>
    <td>- </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>userId not found </td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">
        /users/{userId}/<br>
        gameInfo/{gameId}
    </td>
    <td rowspan="2">
        userId&lt;long&gt;<br>
        gameId&lt;long&gt;
    </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>GameInfo </td>
    <td>Get information of a game </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found / <br>userId not found</td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">
        /users/{userId}/gameHistories/<br>
        {gameId}/stats
    </td>
    <td rowspan="2">
        userId&lt;long&gt;<br>
        gameId&lt;long&gt;
    </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>GameHistory </td>
    <td>Get user's history of a game </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found / <br>userId not found</td>
  </tr>
  <tr>
    <td rowspan="2">GET </td>
    <td rowspan="2">
        /users/{userId}/gameHistories/<br>
        {gameId}/answer
    </td>
    <td rowspan="2">
        userId&lt;long&gt;<br>
        gameId&lt;long&gt;
    </td>
    <td rowspan="2">Query </td>
    <td>200 </td>
    <td>List of 
        answer&lt;String&gt;<br>
        label&lt;String&gt;
    </td>
    <td>Get user's answers and correct answers of game </td>
  </tr>
  <tr>
    <td>404 </td>
    <td>Error&lt;String&gt; </td>
    <td>gameId not found / <br>userId not found </td>
  </tr>
</tbody>
</table>


# Guess the City - Server

## Introduction
This app is a game called “Guess the City”. Players should choose the correct city from multiple choices based on the city image provided by the game.
The game aims to showcase the diverse landscapes of cities around the world while also fostering an increase in geography knowledge.

## Technologies
- [Gradle](https://gradle.org/) - Dependency Management
- [React](https://react.dev/) - Front-end JavaScript Library
- [Spring Boot](https://spring.io/) - Application Framework
- [Google Cloud Platform](https://cloud.google.com/) - Depolyment Service

## High-level Components
- [GameController](https://github.com/sopra-fs23-group-32/SoPra23_Server/blob/main/src/main/java/ch/uzh/ifi/hase/soprafs23/controller/GameController.java) - A controller class that communicates with the client side through endpoints by handling REST requests.
The information it sends to or receives from endpoints is processed by the class [GameService](https://github.com/sopra-fs23-group-32/SoPra23_Server/blob/main/src/main/java/ch/uzh/ifi/hase/soprafs23/service/GameService.java)
- [GameService](https://github.com/sopra-fs23-group-32/SoPra23_Server/blob/main/src/main/java/ch/uzh/ifi/hase/soprafs23/service/GameService.java) - A service class that correlates with [GameController](https://github.com/sopra-fs23-group-32/SoPra23_Server/blob/main/src/main/java/ch/uzh/ifi/hase/soprafs23/controller/GameController.java) to manage the game data and control the game process.
- [ScoreBoardController](https://github.com/sopra-fs23-group-32/SoPra23_Server/blob/main/src/main/java/ch/uzh/ifi/hase/soprafs23/controller/ScoreBoardController.java) - A controller class that offers the endpoints to send user rankings to the client side. It receives the ranking type (general or specific continent category) from the endpoint, and sends to [ScoreBoardService](https://github.com/sopra-fs23-group-32/SoPra23_Server/blob/main/src/main/java/ch/uzh/ifi/hase/soprafs23/service/ScoreBoardService.java), which will return the specified user ranking.
- [ScoreBoardService](https://github.com/sopra-fs23-group-32/SoPra23_Server/blob/main/src/main/java/ch/uzh/ifi/hase/soprafs23/service/ScoreBoardService.java) - A service class that correlates with [ScoreBoardController](https://github.com/sopra-fs23-group-32/SoPra23_Server/blob/main/src/main/java/ch/uzh/ifi/hase/soprafs23/controller/ScoreBoardController.java) to return specified user ranking.


## Launch & Deployment
### Preparations
#### IntelliJ
1. File -> Open... -> SoPra server template
2. Accept to import the project as a `gradle project`
3. To build right click the `build.gradle` file and choose `Run Build`
#### VS Code
The following extensions can help you get started more easily:
-   `vmware.vscode-spring-boot`
-   `vscjava.vscode-spring-initializr`
-   `vscjava.vscode-spring-boot-dashboard`
-   `vscjava.vscode-java-pack`

**Note:** You'll need to build the project first with Gradle, just click on the `build` command in the _Gradle Tasks_ extension. Then check the _Spring Boot Dashboard_ extension if it already shows `soprafs23` and hit the play button to start the server. If it doesn't show up, restart VS Code and check again.

### Building with Gradle
You can use the local Gradle Wrapper to build the application.
-   macOS: `./gradlew`
-   Linux: `./gradlew`
-   Windows: `./gradlew.bat`

More Information about [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) and [Gradle](https://gradle.org/docs/).

#### Build
```bash
./gradlew build
```
#### Run
```bash
./gradlew bootRun
```
#### Test
```bash
./gradlew test
```
#### Development Mode
You can start the backend in development mode, this will automatically trigger a new build and reload the application
once the content of a file has been changed.

Start two terminal windows and run:

`./gradlew build --continuous`

and in the other one:

`./gradlew bootRun`

If you want to avoid running all tests with every change, use the following command instead:

`./gradlew build --continuous -xtest`

### API Endpoint Testing with Postman
We recommend using [Postman](https://www.getpostman.com) to test your API Endpoints.

### Debugging
If something is not working and/or you don't know what is going on. We recommend using a debugger and step-through the process step-by-step.

To configure a debugger for SpringBoot's Tomcat servlet (i.e. the process you start with `./gradlew bootRun` command), do the following:

1. Open Tab: **Run**/Edit Configurations
2. Add a new Remote Configuration and name it properly
3. Start the Server in Debug mode: `./gradlew bootRun --debug-jvm`
4. Press `Shift + F9` or the use **Run**/Debug "Name of your task"
5. Set breakpoints in the application where you need it
6. Step through the process one step at a time

### Testing
Have a look here: https://www.baeldung.com/spring-boot-testing

### External Dependencies


## Roadmap
The top 2-3 features that new developers who want to contribute to your project
could add.


## Authors and Acknowledgment
### Authors
- Said-Haji Abukar - [awhoa](https://github.com/awhoa)
- Zilong Deng - [Zilong Deng](https://github.com/Dzl666)
- Jano-Sven Vukadinovic - [VukadinovicJS](https://github.com/VukadinovicJS)
- Dominic Vogel - [dominic1712](https://github.com/dominic1712)
- Leyi Xu - [leyixu21](https://github.com/leyixu21)

See also the list of [contributors](https://github.com/sopra-fs23-group-32/SoPra23_Server/graphs/contributors) who participated in this project.

### Acknowledgement
- City images provided by [Unsplash API](https://unsplash.com/developers).

## License
This project is licensed under the Apache License 2.0 - see the [LICENSE.md](https://github.com/sopra-fs23-group-32/SoPra23_Server/blob/main/LICENSE) file for details.