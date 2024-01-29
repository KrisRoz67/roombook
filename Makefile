default:
	cat ./Makefile
clean:
	mvnw clean
package:
	mvnw package
db:
	docker compose down
	docker compose -f docker-compose-db.yaml up -d
start: clean package
	docker build -t $(IMAGE_NAME) .
	docker compose -f docker-compose.yaml up -d
clean-start:
	$(MAKE) start
stop:
	docker compose stop
