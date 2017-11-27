curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"red\", \"quantity\" : \"10\", \"price\" : \"1.23\" }" http://localhost:8088/items
curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"blue\", \"quantity\" : \"11\", \"price\" : \"1.24\" }" http://localhost:8088/items
curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"green\", \"quantity\" : \"12\", \"price\" : \"1.25\" }" http://localhost:8088/items
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Frodo\",  \"lastName\" : \"Baggins\" }" http://localhost:8088/people
