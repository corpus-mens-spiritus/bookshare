#!/bin/bash
SCRIPTS_DIR=/load-scripts
DATABASE=bookshare

for JSON_FILE in $(ls $SCRIPTS_DIR); do
	COLLECTION=$(echo $JSON_FILE | cut -f 1 -d '.')

	mongoimport --db $DATABASE --collection $COLLECTION --file $SCRIPTS_DIR/$JSON_FILE --jsonArray
done
