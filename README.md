# Opstest
This is a microservice application that displays "hello az"

## Architecture
The service is hosted on AWS ECS. The simplified architectural diagram is shown below:
![alt text](architecture.jpg?raw=true "Title")

The opstest service is publicy accessible and can be reached through the application loadbalancer.
The time-app service sits in a private subnet and can only be reached by opstest service through the internal loadbalancer.
Both services can scale in and out when the CPU is above 80% or 40% respectively.

## Pipeline
The pipeline used in this setup is AWS Codepipeline. The pipeline can deploy to any of the four environment viz: 
- develop == develop branch on git
- Staging == staging branch on git
- Accepatnce == acceptance branch on git
- Production == master branch on git

With AWS Codepipeline, we can deploy to another region simultenously.

## Setup Project on Local
  * install Docker, Java and Maven
  * Clone the repository `git clone git@github.com:Kenec/service-1.git`
  * Navigate to the directory of the project and run `Docker build -t opstest .`
  * Run the docker container with  `Docker run -p 9090:9090 opstest`

## Issues
To report an issue or give feedback, Click link
[Issues and Feedback](https://github.com/Kenec/service-1/issues)

## License
[MIT License](https://github.com/Kenec/service-1)