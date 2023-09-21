"# sprint-boot-servicio-oauth" 

   # DOCKER
## generar .jar: .\mvnw clean package -DskipTests
## generar imagen: docker build -t servicio-oauth:v1 .
## creando red: docker network create sprintcloud
## levantando servicio: docker run -d -p 9100:9100 --name servicio-oauth --network sprintcloud servicio-oauth:v1
   