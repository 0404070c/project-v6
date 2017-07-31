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
	kubectl delete service weatherstation
DELETE DEPLOYMENT
	kubectl delete deployment weatherstation
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

