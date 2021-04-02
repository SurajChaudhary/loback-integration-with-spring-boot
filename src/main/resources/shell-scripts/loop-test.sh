#!/bin/sh

userdata=`cat data.json`
echo "$userdata"

jq -c '.[]' $userdata | while read i; do
 echo "$i"
done

diff data.json data2.json > diff-data.json

