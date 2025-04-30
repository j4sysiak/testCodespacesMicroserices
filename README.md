# testCodespacesMicroserices

 ################  uruchamiamy lokalnie
1. mvn -N io.takari:maven:wrapper
2. chmod +x mvnw
3. ./mvnw clean package
4. ./mvnw spring-boot:run

################  uruchamiamy na dockerze
1.  docker-compose down      zatrzymuje apl.
2.	docker system prune -a --volumes && docker container prune -f && docker image prune -a -f && docker volume prune -f         Usuwa stare kontenery , Usuwa stare obrazy , Usuwa stare wolumeny
3.  ./mvnw clean package	                    Buduje czysty JAR

4. jezeli nie ma docker-composer.yml w strukturze:
docker build -t demo-spring-boot .	        Buduje nowy obraz
docker run -p 8080:8080 demo-spring-boot	Startuje czysty kontener

5. jezeli jest docker-composer.yml w strukturze:
docker-compose build --no-cache         Buduje nowy obraz
docker-compose up                       Startuje czysty kontener

lub: docker-compose up --build	        Buduje nowy obraz i Startuje czysty kontener (dwa w jednym)



##########. Testy REST

curl https://upgraded-funicular-jrqr5wgwrqv2r4q-8080.app.github.dev/cars/test


dodawanie:
curl -X POST https://upgraded-funicular-jrqr5wgwrqv2r4q-8080.app.github.dev/cars \
     -H "Content-Type: application/json" \
     -d '{"brand": "Toyota", "model": "Corolla"}'

respons:  {"id":1,"brand":"Toyota","model":"Corolla"}


czytanie:
curl https://upgraded-funicular-jrqr5wgwrqv2r4q-8080.app.github.dev/cars

respons:  [{"id":1,"brand":"Toyota","model":"Corolla"}]
