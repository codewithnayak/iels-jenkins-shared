def call(){

    yaml = '''
apiVersion: v1
kind: Pod
metadata:
  name: utility
  labels:
    name: utility
spec:
  containers:
    - name: utility
      image: sekharinweb/utility:latest
      command:
        - "sleep"
      args:
        - "infinity"
      resources:
        limits:
          memory: "128Mi"
          cpu: "500m"

    '''
    return yaml
}