# Deployment Runbook

## Steps
1. Build Docker image
2. Push to registry
3. Run deployment script
4. Verify rollout

## Rollback
kubectl rollout undo deployment/sample-app
