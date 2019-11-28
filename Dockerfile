FROM openjdk:8

COPY . /usr/src/app

WORKDIR /usr/src/app

RUN ./gradlew build

CMD java -jar build/libs/ci-practice-0.0.1-SNAPSHOT.jar