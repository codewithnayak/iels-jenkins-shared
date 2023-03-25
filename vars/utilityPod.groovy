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
    '''
    return yaml
}