java -jar ../wutsi-codegen/target/wutsi-codegen-0.0.23.jar sdk \
    -in https://wutsi-openapi.s3.amazonaws.com/story_api.yaml \
    -out . \
    -name story \
    -package com.wutsi.site \
    -jdk 11 \
    -github_user wutsi \
    -github_project story-sdk-kotlin

if [ $? -eq 0 ]
then
    echo Code Cleanup...
    mvn antrun:run@ktlint-format
    mvn antrun:run@ktlint-format

else
    echo "FAILED"
    exit -1
fi
