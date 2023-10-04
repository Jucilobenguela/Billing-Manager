
FROM mysql:latest

MAINTAINER baeldung.com

#RUN chown -R mysql:root /var/lib/mysql/

ARG MYSQL_DATABASE
ARG MYSQL_USER
ARG MYSQL_PASSWORD
ARG MYSQL_ROOT_PASSWORD

ENV MYSQL_DATABASE=billing
ENV MYSQL_USER=billing
ENV MYSQL_PASSWORD=my-secret-pw
ENV MYSQL_ROOT_PASSWORD=my-secret-pw

#ADD data.sql /etc/mysql/data.sql

#RUN sed -i 's/MYSQL_DATABASE/my_recipe_book/g' /etc/mysql/data.sql
#RUN cp /etc/mysql/data.sql /docker-entrypoint-initdb.d

EXPOSE 3306