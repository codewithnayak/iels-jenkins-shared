/*
* This is the .net build pod template 
* dotnetBuildPod()
* New parameters will be added later 
*/
def call(){
    yaml '''
        apiVersion: v1
        kind: Pod
        metadata:
          labels:
            some-label: dotnet-label-value
        spec:
          containers:
          - name: dotnetcore
            image: mcr.microsoft.com/dotnet/sdk:6.0
            command:
            - cat
            tty: true
        '''

        return yaml;
}