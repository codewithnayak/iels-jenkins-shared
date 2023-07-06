/*
* This is the .net build pod template 
* dotnetBuildPod()
* New parameters will be added later 
*/
def call(){

yaml = '''
    apiVersion: v1
    kind: Pod
    spec:
      containers:
      - name: dotnetcore
        image: mcr.microsoft.com/dotnet/sdk:6.0
        command:
        - sleep
        args:
        - 99d
      - name: kaniko
        image: gcr.io/kaniko-project/executor:debug
        command:
        - sleep
        args:
        - 9999999
        volumeMounts:
        - name: kaniko-secret
          mountPath: /kaniko/.docker
        env:
        - name: GOOGLE_APPLICATION_CREDENTIALS
          value: /secret/kaniko-secret.json
      restartPolicy: Never
      volumes:
      - name: kaniko-secret
        secret:
            secretName: dockercd
            items:
            - key: .dockerconfigjson
              path: config.json
'''
return yaml
}
