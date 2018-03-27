Evolutions must be located in "${project.basedir}/conf" directory. It's hardcoded in EbeanPlugin.onStart() method:

https://github.com/playframework/playframework/blob/2.3.10/framework/src/play-java-ebean/src/main/java/play/db/ebean/EbeanPlugin.java#L97

(on application side of the code, not plugin)