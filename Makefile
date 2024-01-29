default:
	cat ./Makefile

clean:
	mvnw clean

package:
	mvnw package

db:
	docker compose down
	docker compose -f docker-compose-db.yaml up -d

build-image:
	docker buildx build -t roombook_app .

start: clean package build-image
	docker compose -f docker-compose.yaml up -d

clean-start:
	$(MAKE) start

stop:
	docker compose stop
