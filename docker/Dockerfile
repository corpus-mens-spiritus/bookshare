FROM mongo

COPY docker-entrypoint-initdb.d /docker-entrypoint-initdb.d
COPY load-scripts /load-scripts

EXPOSE 27017
