#!/bin/bash

APP=$1
ENV=$2
TAG=$3

echo "Deploying $APP to $ENV"

helm upgrade --install $APP ./helm/sample-app \
  --namespace $ENV \
  --set image.tag=$TAG

kubectl rollout status deployment/$APP -n $ENV
