#!/bin/bash

DATE=`date +%Y-%m-%d`
for file in *.csv; do
  echo ${file%%.*}${DATE}
done
