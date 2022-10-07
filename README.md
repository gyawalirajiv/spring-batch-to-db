# Spring Batch to DB

### To fire up the dockerized Spring Boot image and MySql image
`docker compose up -d`

### Login to the System
#### post request with the credential as given below
##### login path: `/api/token`


`{
"username":"admin",
"password": "pass"
}`

### To request the system to run the Batch Job hit the following url with the GET request with the authorization token from the POST requested above
##### path: `/csv_load`