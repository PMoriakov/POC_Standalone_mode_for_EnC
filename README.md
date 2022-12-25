# POC for Enc validation standalone mode 

## Run commands

## for running enc in platform mode:

```./gradlew clean build```

```java -cp build/libs/enc-0.0.1-SNAPSHOT.jar org.springframework.boot.loader.PropertiesLauncher```

### Check that enc dependencies have been printed to Stdout, example:

mySqlDatabaseImpl

encLoadingService

## for running enc in standalone mode:
```./gradlew clean build```

```java -cp build/libs/enc-0.0.1-SNAPSHOT.jar -Dloader.main=com.protentecs.enc.StandaloneEncApplication org.springframework.boot.loader.PropertiesLauncher --standalone.mode=true```

#### 
