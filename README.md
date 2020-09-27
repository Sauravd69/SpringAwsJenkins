# Jenkins CI CD to deploy web app into tomcat with AWS EC2

# Create EC2
Add Custom TCP with port(8080) into inbound security group

# Java installation
sudo yum install java-1.8.0-openjdk-devel

# Jenkins installation
sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat/jenkins.io.key
sudo yum install jenkins -y
sudo chkconfig jenkins on
sudo service jenkins start
sudo cat pathoffilewherepasswordinluded
reference (https://www.youtube.com/watch?v=hVhkuoUBDWY)

# Tomcat installation
follow https://www.youtube.com/watch?v=68WNroQBUts
https://github.com/yankils/Simple-DevOps-Project/blob/master/Tomcat/tomcat_installation.MD

# CI CD process
https://www.youtube.com/watch?v=1jsKGhXmm4c
