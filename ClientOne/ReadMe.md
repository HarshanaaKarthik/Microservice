# STEPS :
- create starter spring boot project by selecting Eureka discovery client option by which client dependencies will be added in pom.xml
- add server.port & provide a name if required in application.properties
- add @EnableEurekaClient in main file 
[application automatically registers with the Eureka Server]

#Issues Encountered :
- @Bean of type DiscoveryClientOptionalArgs 
	=> added spring-boot-starter-web depedency
- The cilent service looks for Eureka server at port 8761 , since diff port of 8401 been mentioned in Server it shows #Connect to localhost:8761 when booting the application 
	=> changed server port
	
# Run At : 
http://localhost:8081/clientone/{api-url}

Note : https://cloud.spring.io/spring-cloud-netflix/multi/multi__service_discovery_eureka_clients.html