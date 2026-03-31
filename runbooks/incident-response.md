# Incident Response Runbook

## Steps
1. Check alerts (Grafana/Prometheus)
2. Check pods:
   kubectl get pods
3. Check logs:
   kubectl logs <pod>

## Common Issues
- OOMKilled → increase memory / optimize app
- CrashLoopBackOff → check config/env

## Rollback
kubectl rollout undo deployment/sample-app
