# exs-services
Simple CRUD application using MongoDB, MongoExpress and Docker.

1 - Access MongoExpress by http://localhost:8081/

2 - Create DB servicesexsdb

3 - Open a terminal session in docker folder and run the command docker-compose up

4 - Import in postman the curls ahead;

Basic cUrls :

{
	"info": {
		"_postman_id": "aa82409c-5394-4bd2-bf74-7d23189573ba",
		"name": "estudos",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "13456959"
	},
	"item": [
		{
			"name": "customerById",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8001/customers/63fbc82c7d989820ca113e2e",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8001",
					"path": [
						"customers",
						"63fbc82c7d989820ca113e2e"
					]
				}
			},
			"response": []
		},
		{
			"name": "getAllCustomers",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8001/customers",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8001",
					"path": [
						"customers"
					]
				}
			},
			"response": []
		},
		{
			"name": "createCustomer",
			"request": {
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json"
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"firstName\": \"John\",\n    \"lastName\": \"Di Cesare\",\n    \"email\": \"dicesare@gmail.com\"\n}\n"
				},
				"url": {
					"raw": "http://localhost:8001/customers",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8001",
					"path": [
						"customers"
					]
				}
			},
			"response": []
		},
		{
			"name": "updateCustomer",
			"request": {
				"method": "PUT",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json"
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n        \"firstName\": \"John\",\n        \"lastName\": \"Doe\",\n        \"email\": \"johndoe@gmail.com\"\n      }"
				},
				"url": {
					"raw": "http://localhost:8001/customers/63fbc3b27d989820ca113e23",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8001",
					"path": [
						"customers",
						"63fbc3b27d989820ca113e23"
					]
				}
			},
			"response": []
		},
		{
			"name": "delete",
			"request": {
				"method": "DELETE",
				"header": [],
				"url": {
					"raw": "http://localhost:8001/customers/63fbc82c7d989820ca113e2e",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8001",
					"path": [
						"customers",
						"63fbc82c7d989820ca113e2e"
					]
				}
			},
			"response": []
		}
	]
}


