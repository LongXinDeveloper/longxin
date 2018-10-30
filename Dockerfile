FROM nginx
RUN echo '<h1>Hello Openshift Docker</h1>' > /usr/share/nginx/html/index.html
