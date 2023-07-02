/*
* This is the .net build pod template 
* terraformPod()
* New parameters will be added later 
*/
def call(){
    yaml = '''
        apiVersion: v1
        kind: Pod
        metadata:
          name: terraform
          labels:
            some-label: terraform
        spec:
          containers:
          - name: terraform
            image: hashicorp/terraform
            command: ["/bin/sh", "-c"]
            args:
            - cat
            tty: true
        '''
        return yaml
}