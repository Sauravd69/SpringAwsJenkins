# Jenkins CI CD to deploy web app into tomcat with AWS EC2

# Create EC2
Add Custom TCP with port(8080) into inbound security group

# Java installation
1. sudo yum install java-1.8.0-openjdk-devel
2. sudo amazon-linux-extras install java-openjdk11
3. sudo alternatives --config java

# Maven installation
1. sudo wget https://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo
2. sudo sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo
3. sudo yum install -y apache-maven
4. Reference: https://docs.aws.amazon.com/neptune/latest/userguide/iam-auth-connect-prerq.html

# Jenkins installation
1. sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat/jenkins.repo
2. sudo rpm --import https://pkg.jenkins.io/redhat/jenkins.io.key
3. sudo yum install jenkins -y
4. sudo chkconfig jenkins on
5. sudo service jenkins start
6. sudo cat pathoffilewherepasswordinluded
7. reference (https://www.youtube.com/watch?v=hVhkuoUBDWY)
8. It should work on port 8080. Otherwise try sudo yum update, sudo yum install java
9. Entering Jenkins without credentials https://www.serverlab.ca/tutorials/linux/administration-linux/how-to-reset-jenkins-admin-users-password/

# Tomcat installation
follow https://www.youtube.com/watch?v=68WNroQBUts
https://github.com/yankils/Simple-DevOps-Project/blob/master/Tomcat/tomcat_installation.MD

# CI CD process
https://www.youtube.com/watch?v=1jsKGhXmm4c

# Jenkins and AWS EC2 Connection Over SSH
https://www.youtube.com/watch?v=s7FtPa2sD2s
