How this project was created:

On IntelliJ Ultimate 2020.3,
New Project using the SpringInitializr.
Dependencies = Spring Web

SpringInitializer adds two dependencies...

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

03/12/21:

From the Tomcat8 version, copied the static html (for the initial form) into \src\main\resources\static\index.html
   (There is no web.xml file here. So the index.html will be picked up by convention (needing only to be provided).)

Added a dependency on the IncomeAnalyzerLibrary via POM file...

        <dependency>
            <groupId>us.deans.core</groupId>
            <artifactId>IncomeAnalyzerLibrary</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>

04/08/2021:

Installed the IncomeAnalyzerLibrary to my JFrog repository at https://coldfront.jfrog.io

Therefore, the dependency needed to be updated... (the previous entry is for the local bytecode on the .m2 repository.)

        <dependency>
            <groupId>us.deans.core</groupId>
            <artifactId>IncomeAnalyzerLibrary</artifactId>
            <version>0.0.1-20210401.152744-1</version>
        </dependency>

Configuring project to use JSP for the view technology. This requires two more dependencies, one on any provision of
the Servlet API and one on the Javascript Tag Library (JSTL).

        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>

        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>





