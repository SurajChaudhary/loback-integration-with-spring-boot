#!/bin/sh

echo "Starting with git job..."

if [ -d "git-project" ];
then
echo "Deleting existing directory...."
rm -rf "git-project"
echo "Directory deleted...."
fi

mkdir git-project
cd git-project

git clone https://gitlab.com/surajdevgroup/shell-script-demo.git
echo "Git clone completed..."
cd shell-script-demo
git fetch
git checkout master
echo "Git checkout master completed..."
git pull origin master
cd com/devtalk/conduit/realms
echo "Inside realms folder...."
userdata=`cat users.json`
echo $userdata

PAYLOAD='{"userName": "dummy-user@acme.com", "password": "secret_Password"}'
RESPONSE=`curl -s --request POST -H "Content-Type:application/json; charset=UTF-8" http://localhost:8080/login --data "${PAYLOAD}"`
TOKEN= echo "$RESPONSE"

echo "$TOKEN"

USERSRES=`curl -s --request POST -H "Content-Type:application/json; charset=UTF-8" http://localhost:8080/users --data @users.json`

echo "$USERSRES"

jq -c '.[]' $USERSRES | while read i; do
 echo "$i"
done

