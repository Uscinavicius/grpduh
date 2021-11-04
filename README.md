# grpduh
#### The Start of something... 

## First.
- Virtual Network
- Security
- Webserver
- Database?
- Game Server

## Technoloy 
- CentOS 8 https://www.centos.org/
- XDRP http://xrdp.org/
- Git Hub https://github.com/
- Boxes https://wiki.gnome.org/Apps/Boxes
- Docker
    - was installed using this guide : 
    - https://docs.docker.com/engine/install/centos/#install-using-the-repository
    - https://linuxhint.com/install-use-docker-centos-8/

    Process
    - Installed
    - Started the Deamon for docker
    - Set Docker to start on server starup
    - Status check command : **sudo systemctl status docker**
    
    The syntax of writing the docker command is:
    - docker [option] [command] [arguments]
    - sudo docker run hello-world
![image](https://user-images.githubusercontent.com/31678437/139942677-cf2ac15a-dab3-488f-a895-031e893b710d.png)
    
    
- MySQL with docker : https://hub.docker.com/_/mysql

~~sudo docker run --name testdb-mysql -e MYSQL_ROOT_PASSWORD=password -d mysql:latest~~

sudo docker run --name testdb -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql

local login : 
![image](https://user-images.githubusercontent.com/31678437/139952674-9bcddcf5-231e-44e2-8828-cb422df2bdca.png)

type exit to leave
    
Using MySQL Workbench

    External login for DB:
    - ServerIP:3306
    - password
    
Other:
https://www.youtube.com/watch?v=kphq2TsVRIs&ab_channel=DatabaseStar
https://codingnconcepts.com/spring-boot/deployment-of-microservices-using-docker-and-jenkins/
https://spring.io/guides/gs/spring-boot-docker/
Jenkins https://www.youtube.com/watch?v=pMO26j2OUME&ab_channel=TechWorldwithNana

##FRONTEND
https://code.visualstudio.com/docs/nodejs/reactjs-tutorial

## Code Project Ideas
DeltaX

robit : Gazebo, R.O.S

WebApp - Tutorial : 

- Database - MySQL
- BackEnd - Spring Boot
- FrontEnd - React

Deployments

DATABASE 
- Budget 
    - Person
        - Name, Password
    - Data
        - Spent, Where, When, What, Category

Backend
- Getters and Setters
- Endpoint
    - Gets Person info with all transactions

FrontEnd
- Sign In 
- Transaction/Data Analytics
