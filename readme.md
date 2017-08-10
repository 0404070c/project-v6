START MINIKUBE
	minikube start
RATHER THAN PUSHING THE DOCKER IMAGE, USE MINIKUBE LOCALLY
	eval $(minikube docker-env)
	eval $(minikube docker-env -u) TO UNDO
BUILD DOCKER IMAGE
	docker build -t weatherstationone:v1 .
	docker build -t weatherstationtwo:v1 .
	docker build -t weatherstationthree:v1 .
CREATE A DEPLOYMENT
	kubectl run weatherstationone --image=weatherstationone:v1 --port=8001
	kubectl run weatherstationtwo --image=weatherstationtwo:v1 --port=8002
	kubectl run weatherstationthree --image=weatherstationthree:v1 --port=8003
CREATE A SERVICE
	kubectl expose deployment weatherstationone --type=LoadBalancer
	kubectl expose deployment weatherstationtwo --type=LoadBalancer
	kubectl expose deployment weatherstationthree --type=LoadBalancer
RUN A SERVICE IN BROWSER
	minikube service weatherstation	
SCALE THE DEPLOYMENT
	kubectl scale deployment weatherstation --replicas 20
DELETE SERVICE
	kubectl delete service weatherstationone
DELETE DEPLOYMENT
	kubectl delete deployment weatherstationone
TO UPDATE THE APP
	docker build -t producer:v1 .
	kubectl set image deployment/producer producer=producer:v1

OTHER COMMANDS
	minikube start
	minikube stop
	kubectl get deployments
	kubectl get pods
	kubectl get services
	kubectl get deploy
	kubectl get rs
	minikube ip
	minikube dashboard
	kubectl describe deployments producer
	docker rmi <IMAGE>
	rocker rm <CONTAINER>


	kubectl create -f weatherapp_deployment.yaml
	kubectl create -f weatherapp_service.yaml


	1### IN DOCKER QUICKSTART TERMINAL
	docker build -t weatherapp:latest .
	2###
	docker tag weatherapp:latest gcr.io/weather-176316/weatherapp:latest
	3###
	gcloud docker -- push gcr.io/weather-176316/weatherapp:latest
	4### IN GOOGLE CLOUD SHELL
	kubectl run weatherapp --image=gcr.io/weather-176316/weatherapp:latest --port=8080
	5###
	kubectl expose deployment weatherapp --type=LoadBalancer
	6###
	kubectl get service weatherapp
	7###
	kubectl scale deployment weatherapp --replicas 3
	

	WEATHERSTATIONONE: http://35.202.53.47:8001/
	WEATHERSTATIONTWO: http://35.202.127.198:8002/
	WEATHERSTATIONTHREE: http://35.188.76.15:8003/
	WEATHERCOLLECTOR: http://35.192.230.250:8000
	WEATHERAPP: http://35.193.192.238:8080/


