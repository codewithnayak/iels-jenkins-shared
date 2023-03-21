/*
* This is the .net build pod template 
* dotnetBuildPod()
* New parameters will be added later 
*/
def call(){
    yaml = '''
        apiVersion: v1
        kind: Pod
        metadata:
          labels:
            some-label: helm
        spec:
          containers:
          - name: helm
            image: lachlanevenson/k8s-helm:v3.1.1
            command:
            - cat
            tty: true
        '''
        return yaml
}